package com.disney.disneycharacters.exception;

public class ResourceNotFoundException extends Exception {
    public ResourceNotFoundException() {
    }

    public ResourceNotFoundException( String message ) {
        super( message );
    }
}
