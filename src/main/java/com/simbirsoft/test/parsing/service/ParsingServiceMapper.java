package com.simbirsoft.test.parsing.service;

import com.simbirsoft.test.parsing.base.IO.parse_url.ParseUrlInput;
import com.simbirsoft.test.parsing.base.IO.parse_url.ParseUrlOutput;
import com.simbirsoft.test.parsing.service.IO.ParseUrlServiceInput;
import com.simbirsoft.test.parsing.service.IO.ParseUrlServiceOutput;
import org.springframework.stereotype.Component;

@Component
public class ParsingServiceMapper {
    public ParseUrlInput mapParseUrlInput(ParseUrlServiceInput parseUrlServiceInput) {
        return new ParseUrlInput(parseUrlServiceInput.getUrl());
    }

    public ParseUrlServiceOutput mapParseUrlOutput(ParseUrlOutput parseUrlOutput) {
        return new ParseUrlServiceOutput(parseUrlOutput.getParsedWords());
    }
}
