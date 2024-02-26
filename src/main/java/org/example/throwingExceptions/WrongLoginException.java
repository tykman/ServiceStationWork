package org.example.throwingExceptions;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException(String msg) {
        super(msg);
        System.out.println("Invalid login or invalid characters used!");
    }
}
