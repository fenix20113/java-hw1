package Validator;

public class PasswordValidator {

    /*
     *  (?=.*\d) - At least one digit.
     *  (?=.*[a-zA-Z]) - At least one symbol.
     *  (?=.*[#?!@$%^&*-]) - At least one special character.
     *  [a-zA-Z0-9#?!@$%^&*-]{5,10} - The length of password should be between 5 and 10 characters.
     */
    private final static String PASSWORD_PATTERN = "^(?=.*\\d)(?=.*[a-zA-Z])(?=.*[#?!@$%^&*-])[a-zA-Z0-9#?!@$%^&*-]{5,10}$";

    public static Boolean isValid(String password) {
        return password.matches(PASSWORD_PATTERN);
    }
}
