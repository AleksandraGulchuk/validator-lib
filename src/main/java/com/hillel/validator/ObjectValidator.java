package com.hillel.validator;

import com.hillel.exception.ValidationException;

public interface ObjectValidator<T> {

    void validate(T o) throws ValidationException;
}
