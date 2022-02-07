package com.chel.ya.parsing.logic;

public enum Separators {
    SPACE(' ', "\\s"),
    COMMA(',',","),
    DOT('.', "\\."),
    EXCLAMATION_POINT('!',"!"),
    QUESTION_MARK('?',"\\?"),
    DOUBLE_QUOTES('"',"\""),
    SEMICOLON(';', ";"),
    COLON(':', ":"),
    SQUARE_BRACKET_OPENED('[',"\\["),
    SQUARE_BRACKET_CLOSED(']', "\\]"),
    PARENTHESIS_OPENED('(', "\\("),
    PARENTHESIS_CLOSED(')', "\\)"),
    LINE_FEED('\n',"\\n"),
    CARRIAGE_RETURN('\r', "\\n"),
    CHARACTER_TABULATION('\t', "\\t");

    private final char literal;
    private final String regex;

    Separators(char separator, String regex) {
        this.literal = separator;
        this.regex = regex;
    }

    public char getLiteral() {
        return literal;
    }

    public String getRegex() {
        return regex;
    }
}
