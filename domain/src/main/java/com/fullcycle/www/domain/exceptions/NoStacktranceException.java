package com.fullcycle.www.domain.exceptions;

public class NoStacktranceException extends RuntimeException {

    public NoStacktranceException(final String message) {
        this(message, null);
    }

    public NoStacktranceException(final String message, final Throwable cause) {
        super(message, cause, true, false);
    }


}
