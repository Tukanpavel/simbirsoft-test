package com.simbirsoft.test.parsing;

import com.simbirsoft.test.parsing.base.IO.parse_url.ParseUrlInput;
import com.simbirsoft.test.parsing.base.IO.parse_url.ParseUrlOutput;
import com.simbirsoft.test.parsing.service.IO.ParseUrlServiceInput;
import com.simbirsoft.test.parsing.service.IO.ParseUrlServiceOutput;
import com.simbirsoft.test.parsing.logic.ParsingServiceManager;
import com.simbirsoft.test.parsing.service.ParsingServiceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ParsingService {
    @Autowired
    ParsingServiceManager parsingServiceManager;
    @Autowired
    ParsingServiceMapper parsingServiceMapper;

    public ParseUrlServiceOutput parseUrl(ParseUrlServiceInput parseUrlServiceInput) throws IOException {
        ParseUrlInput parseUrlInput = parsingServiceMapper.mapParseUrlInput(parseUrlServiceInput);
        ParseUrlOutput parseUrlOutput = parsingServiceManager.parseUrl(parseUrlInput);

        return parsingServiceMapper.mapParseUrlOutput(parseUrlOutput);
    }
}
