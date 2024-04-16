package org.example.throwingExceptions;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException(String msg) {
        super(msg);
        msg = "Invalid password or incorrect password confirmation!";
        System.out.println(msg);
    }

}
