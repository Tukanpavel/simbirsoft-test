package com.chel.ya.parsing.base.IO.parse_url;

import com.chel.ya.parsing.base.service.ParsedWord;

import java.util.List;

public class ParseUrlOutput {
    private final List<ParsedWord> parsedWords;

    public ParseUrlOutput(List<ParsedWord> parsedWords) {
        this.parsedWords = parsedWords;
    }

    public List<ParsedWord> getParsedWords() {
        return parsedWords;
    }
}
