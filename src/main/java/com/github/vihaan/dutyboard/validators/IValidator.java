package com.github.vihaan.dutyboard.validators;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;
import java.util.stream.Collectors;

public interface IValidator<T> {

    Set<String> isValid(T objectToValidate);

    default Set<String> isValid(T objectToValidate, Set<String> errors){
        errors.addAll(validatorCheck(objectToValidate));
        return errors;
    }

    private Set<String> validatorCheck(T objectToValidate) {
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<T>> validationErrors = validator.validate(objectToValidate);
        return validationErrors.stream().map(ConstraintViolation::getMessage).collect(Collectors.toSet());
    }

    String DUPLICATE_BOARD_ERROR = "Board of provided duty type already exists.";
}
