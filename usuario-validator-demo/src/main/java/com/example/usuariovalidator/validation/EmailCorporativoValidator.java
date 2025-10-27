/*
 * O validador verifica se o e-mail termina com o domínio corporativo definido.
 * Se for nulo ou vazio, é ignorado (para evitar conflitos com @NotBlank).
 */


package com.example.usuariovalidator.validation;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EmailCorporativoValidator implements ConstraintValidator<EmailCorporativo, String> {

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        if (email == null || email.isBlank()) return true;
        return email.toLowerCase().endsWith("@empresa.com");
    }
}
