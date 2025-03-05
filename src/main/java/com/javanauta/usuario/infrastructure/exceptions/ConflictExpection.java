package com.javanauta.usuario.infrastructure.exceptions;

public class ConflictExpection extends  RuntimeException {

    public ConflictExpection(String message) {
        super(message);

    }

    public ConflictExpection(String message, Throwable cause) {
        super(message);
    }
}
