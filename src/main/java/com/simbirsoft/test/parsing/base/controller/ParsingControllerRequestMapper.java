package com.simbirsoft.test.parsing.base.controller;

import com.simbirsoft.test.parsing.service.IO.ParseUrlServiceInput;
import org.springframework.stereotype.Component;

@Component
public class ParsingControllerRequestMapper {
    public ParseUrlServiceInput mapParseUrl(ParseUrlRequest parseUrlRequest) {
        return new ParseUrlServiceInput(parseUrlRequest.getUrl());
    }
}
