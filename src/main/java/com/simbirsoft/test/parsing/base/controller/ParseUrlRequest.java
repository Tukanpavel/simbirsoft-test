package com.simbirsoft.test.parsing.base.controller;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class ParseUrlRequest {
    @NotNull
    private String url;

    public ParseUrlRequest() {
    }

    public ParseUrlRequest(String url) {
        this.url = url;
    }
}
