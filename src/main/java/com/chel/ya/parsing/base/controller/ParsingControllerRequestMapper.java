package com.chel.ya.parsing.base.controller;

import com.chel.ya.parsing.service.IO.ParseUrlServiceInput;
import org.springframework.stereotype.Component;

@Component
public class ParsingControllerRequestMapper {
    public ParseUrlServiceInput mapParseUrl(ParseUrlRequest parseUrlRequest) {
        return new ParseUrlServiceInput(parseUrlRequest.getUrl());
    }
}
