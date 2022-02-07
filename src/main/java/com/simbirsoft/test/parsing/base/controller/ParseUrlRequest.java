package com.simbirsoft.test.parsing.base.controller;

import org.immutables.value.Value;

@Value.Immutable
@Value.Style(jdkOnly = true)
public interface ParseUrlRequest {
    String getUrl();
}
