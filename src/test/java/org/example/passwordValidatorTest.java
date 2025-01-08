package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;


public class passwordValidatorTest {

    @DisplayName("비밀번호가 최소 8자리 이상 12자리 이하면 예외가 발생하지 않는다.")
    @Test
    void validatePasswordTest() {
        assertThatCode(() -> passwordValidator.validate("12345678")).doesNotThrowAnyException();

    }

    @DisplayName("비밀번호가 최소 8자리 이상 12자리 이하면 예외가 발생하지 않는다.")
    @Test
    void validatePasswordTest2() {

    }

}
