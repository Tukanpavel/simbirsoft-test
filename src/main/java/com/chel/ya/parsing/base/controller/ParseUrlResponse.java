package com.chel.ya.parsing.base.controller;

import com.chel.ya.parsing.base.service.ParsedWord;

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
