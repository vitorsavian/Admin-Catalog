package com.fullcycle.www.domain.exceptions;

import com.fullcycle.www.domain.validation.Error;

import java.util.List;

public class DomainException extends NoStacktranceException {

    private final List<Error> errors;

    private DomainException(final String aMessage, final List<Error> anErrors) {
        super("");
        this.errors = anErrors;
    }

    public static DomainException with(final Error anErrors) {
        return new DomainException(anErrors.message(), List.of(anErrors));
    }

    public static DomainException with(final List<Error> anErrors) {
        return new DomainException("", anErrors);
    }

    public List<Error> getErrors() {
        return this.errors;
    }
}
