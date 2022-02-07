package com.simbirsoft.test.parsing;

import com.simbirsoft.test.parsing.service.IO.ParseUrlServiceInput;
import com.simbirsoft.test.parsing.service.IO.ParseUrlServiceOutput;
import com.simbirsoft.test.parsing.base.controller.ParseUrlRequest;
import com.simbirsoft.test.parsing.base.controller.ParseUrlResponse;
import com.simbirsoft.test.parsing.base.controller.ParsingControllerRequestMapper;
import com.simbirsoft.test.parsing.base.controller.ParsingControllerResponseMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class ParsingController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ParsingController.class);

    @Autowired
    ParsingService parsingService;
    @Autowired
    ParsingControllerRequestMapper parsingControllerRequestMapper;
    @Autowired
    ParsingControllerResponseMapper parsingControllerResponseMapper;

    @RequestMapping(path = "/parseUrl", method = RequestMethod.POST)
    public @ResponseBody ParseUrlResponse parseUrl(@RequestBody ParseUrlRequest parseUrlRequest) throws IOException {
        //TODO 1: add logging
        ParseUrlServiceInput parseUrlServiceInput = parsingControllerRequestMapper.mapParseUrl(parseUrlRequest);
        ParseUrlServiceOutput parseUrlServiceOutput = parsingService.parseUrl(parseUrlServiceInput);

        return parsingControllerResponseMapper.mapParseUrl(parseUrlServiceOutput);
    }
}
