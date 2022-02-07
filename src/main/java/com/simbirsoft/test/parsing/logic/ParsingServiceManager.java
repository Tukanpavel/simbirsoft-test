package com.simbirsoft.test.parsing.logic;

import com.simbirsoft.test.parsing.base.IO.parse_url.ParseUrlInput;
import com.simbirsoft.test.parsing.base.IO.parse_url.ParseUrlOutput;
import com.simbirsoft.test.parsing.base.service.ParsedWord;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

@Component
public class ParsingServiceManager {
    @Autowired
    SeparatorMapper separatorMapper;

    public ParseUrlOutput parseUrl(ParseUrlInput parseUrlInput) throws IOException {
        //TODO 1: add logging with start and end messages
        //TODO 2: add error handling
        String url = parseUrlInput.getUrl();
        String pattern = separatorMapper.mapPattern();

        Document document = Jsoup.connect(url).get();
        List<String> pageText = document.body().getAllElements().eachText();

        List<String> words = new ArrayList<>();
        for (String s : pageText) {
            Arrays.asList(s.split(pattern)).forEach(words::add);
        }

        Set<String> distinctWords = new HashSet<>(words);

        List<ParsedWord> parsedWords = distinctWords.stream().map(word -> {
            int count = Collections.frequency(words, word);
            return new ParsedWord(word, count);
        }).collect(Collectors.toList());


        return new ParseUrlOutput(parsedWords);
    }
}
