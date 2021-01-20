package com.hillel.validator;

import com.hillel.exception.ValidationException;
import com.hillel.validator.rules.ValidatorRule;

import java.util.List;

public class RulesBasedObjectValidator<T> implements ObjectValidator<T> {

    private final List<ValidatorRule<T>> rules;

    public RulesBasedObjectValidator(List<ValidatorRule<T>> rules) {
        this.rules = rules;
    }

    @Override
    public void validate(T o) throws ValidationException {
        for (ValidatorRule<T> rule : rules) {
            if (!rule.validate(o)) {
                throw new ValidationException(rule.errorMessage());
            }
        }
    }
}
