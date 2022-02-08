package com.simbirsoft.test.parsing.base.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class ParsedWord {
    private String word;
    private int count;
}
