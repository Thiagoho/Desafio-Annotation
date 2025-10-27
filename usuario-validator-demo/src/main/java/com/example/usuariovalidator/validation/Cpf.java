package com.example.usuariovalidator.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = CpfValidator.class)
@Target({ FIELD })
@Retention(RUNTIME)
public @interface Cpf {
    String message() default "CPF inválido. Use o formato XXX.XXX.XXX-XX";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
