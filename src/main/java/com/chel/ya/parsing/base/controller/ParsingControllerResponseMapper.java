package com.chel.ya.parsing.base.controller;

import com.chel.ya.parsing.service.IO.ParseUrlServiceOutput;
import org.springframework.stereotype.Component;

@Component
public class ParsingControllerResponseMapper {
    public ParseUrlResponse mapParseUrl(ParseUrlServiceOutput parseUrlServiceOutput) {
        return new ParseUrlResponse(parseUrlServiceOutput.getParsedWords());
    }
}
