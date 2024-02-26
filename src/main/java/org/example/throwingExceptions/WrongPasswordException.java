package org.example.throwingExceptions;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException(String msg) {
        super(msg);
        System.out.println("Invalid password or incorrect password confirmation!");
    }

}
