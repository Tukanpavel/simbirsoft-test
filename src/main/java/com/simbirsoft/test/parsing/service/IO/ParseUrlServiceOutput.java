package com.simbirsoft.test.parsing.service.IO;

import com.simbirsoft.test.parsing.base.service.ParsedWord;

import java.util.List;


public class ParseUrlServiceOutput {
    private final List<ParsedWord> parsedWords;

    public ParseUrlServiceOutput(List<ParsedWord> parsedWords) {
        this.parsedWords = parsedWords;
    }

    public List<ParsedWord> getParsedWords() {
        return parsedWords;
    }
}
