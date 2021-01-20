package com.hillel.validator.rules;

public interface ValidatorRule<T> {

    boolean validate(T value);
    String errorMessage();
}
