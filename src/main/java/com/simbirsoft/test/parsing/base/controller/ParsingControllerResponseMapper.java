package com.simbirsoft.test.parsing.base.controller;

import com.simbirsoft.test.parsing.service.IO.ParseUrlServiceOutput;
import org.springframework.stereotype.Component;

@Component
public class ParsingControllerResponseMapper {
    public ParseUrlResponse mapParseUrl(ParseUrlServiceOutput parseUrlServiceOutput) {
        return new ParseUrlResponse(parseUrlServiceOutput.getParsedWords());
    }
}
