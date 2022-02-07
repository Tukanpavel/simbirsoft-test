package com.simbirsoft.test.parsing.logic;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.Collectors;

@Component
public class SeparatorMapper {
    public String mapPattern() {
        String pattern = Arrays.stream(Separators.values())
                .map(separator -> separator.getRegex())
                .collect(Collectors.joining());
        return "[" + pattern + "]";
    }
}
