package com.simbirsoft.test.parsing.base.controller;

import com.simbirsoft.test.parsing.base.service.ParsedWord;

import java.util.List;

public class ParseUrlResponse {
    private final List<ParsedWord> parsedWords;

    public ParseUrlResponse(List<ParsedWord> parsedWords) {
        this.parsedWords = parsedWords;
    }

    public List<ParsedWord> getParsedWords() {
        return parsedWords;
    }
}
