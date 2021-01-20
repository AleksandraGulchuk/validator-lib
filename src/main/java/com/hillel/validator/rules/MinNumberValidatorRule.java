package com.hillel.validator.rules;

public class MinNumberValidatorRule implements ValidatorRule<Number> {

    private final Number minValue;

    public MinNumberValidatorRule(Number minValue) {
        this.minValue = minValue;
    }

    @Override
    public boolean validate(Number value) {
        if (value instanceof Double || value instanceof Float
                || minValue instanceof Double || minValue instanceof Float){
            return value.floatValue() > minValue.floatValue();
        } else{
            return value.longValue() > minValue.longValue();
        }
    }

    @Override
    public String errorMessage() {
        return "The value is less than the minimum value";
    }
}
