package com.hillel.validator.rules;

public class MaxNumberValidatorRule implements ValidatorRule<Number> {

    private final Number maxValue;

    public MaxNumberValidatorRule(Number maxValue) {
        this.maxValue = maxValue;
    }

    @Override
    public boolean validate(Number value) {
        if (value instanceof Double || value instanceof Float
                || maxValue instanceof Double || maxValue instanceof Float) {
            return value.floatValue() < maxValue.floatValue();
        } else {
            return value.longValue() < maxValue.longValue();
        }
    }

    @Override
    public String errorMessage() {
        return "The value is greater than the maximum value";
    }
}
