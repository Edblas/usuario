package com.javanauta.usuario.infrastructure.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String messagem, Throwable Thorwable) {
        super(messagem, Thorwable);
    }
}
