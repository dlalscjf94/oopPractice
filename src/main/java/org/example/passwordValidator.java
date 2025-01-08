package org.example;

public class passwordValidator {

    private final static String WRONG_PASSWORD_LENGTH_MESSAGE = "비밀번호는 8자리이상, 12자리 이하입니다.";

    public static void validate(String password) {

        int length = password.length();

        if (length < 8 || length > 12) {
            throw new IllegalArgumentException(WRONG_PASSWORD_LENGTH_MESSAGE);
        }

    }
}
