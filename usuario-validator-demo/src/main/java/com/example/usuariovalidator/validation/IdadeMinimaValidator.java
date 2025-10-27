package com.example.usuariovalidator.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class IdadeMinimaValidator implements ConstraintValidator<IdadeMinima, Integer> {

    private int idadeMinima;

    @Override
    public void initialize(IdadeMinima constraintAnnotation) {
        this.idadeMinima = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(Integer idade, ConstraintValidatorContext context) {
        if (idade == null) return true;
        return idade >= idadeMinima;
    }
}