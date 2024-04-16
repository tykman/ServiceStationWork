package org.example.throwingExceptions;

public class ExceptionClass {
    private static final String login = "Java_language_of_123";
    private static final String password = "12345678901234567890";
    private static final String confirmPassword = "12345678901234567890";
    private static final int size = 20;

    public ExceptionClass() {}

    public static void showExceptionThrown(String login,String password,String confirmPassword) {
        if(login.length() > size ) {
            throw new WrongLoginException("");
        }
        if (password.length() > size || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("");
        }
    }

    public static void interception() {
        System.out.println("Worked method interception()");
        try {
            showExceptionThrown("Java_language_of_123","12345678901234567890",
                    "12345678901234567890");
        } catch (WrongLoginException | WrongPasswordException e) {
            //noinspection ThrowablePrintedToSystemOut
            System.out.println(e);
        } finally {
            System.out.println("Verification completed!");
        }
    }

    public static void main(String[] args) {
         showExceptionThrown(login,password,confirmPassword);
         interception();
    }

}
