package com.thoughtworks.ddd.repository;

@SuppressWarnings("serial")
public class NonUniqueObjectSelectedException extends Exception {

    public NonUniqueObjectSelectedException() {
    }

    public NonUniqueObjectSelectedException(final Exception cause) {
        super(cause);
    }

}
