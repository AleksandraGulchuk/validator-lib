package com.hillel.validator.rules;

public class StartsWithValidatorRule implements ValidatorRule<String>{

    private final String start;

    public StartsWithValidatorRule(String start) {
        this.start = start;
    }

    @Override
    public boolean validate(String value) {
        return value.startsWith(start);
    }

    @Override
    public String errorMessage() {
        return "The value is not starting with " + start;
    }
}
