package org.example.throwingExceptions;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException(String msg) {
        super(msg);
        msg = "Invalid login or invalid characters used!";
        System.out.println(msg);
    }
}
