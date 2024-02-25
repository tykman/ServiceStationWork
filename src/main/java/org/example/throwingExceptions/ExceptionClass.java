package org.example.throwingExceptions;

public class ExceptionClass {
    String login, password, confirmPassword;

    public ExceptionClass(String login,String password,String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static void showExceptionThrown(String login,String password,String confirmPassword) {
        if(login.length() > 4 || !login.equals(login)) {
            throw new WrongLoginException("");
        }
        if (password.length() > 4 || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("");
        }
    }

    public static void interception(String s) {
        System.out.println("Worked method interception()");
        try {
            showExceptionThrown("","","");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e);
        } finally {
            System.out.println("Verification completed!");
        }
    }

    public static void main(String[] args) {
        ExceptionClass ex = new ExceptionClass("Java","1234","1234");
        showExceptionThrown(ex.login, ex.password, ex.confirmPassword);
        interception("");
    }

}
