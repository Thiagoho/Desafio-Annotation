package com.example.usuariovalidator.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = IdadeMinimaValidator.class)
@Target({ FIELD })
@Retention(RUNTIME)
public @interface IdadeMinima {
    int value();
    String message() default "Idade mínima não atingida.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}