package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

/*
* 비밀번호는 최소 8자 이상 12자 이하여야 한다
* 비밀번호는 8자 미만, 12자 초과인 경우 illegalArgumentException 이 발생한다.
* 경계조건에 대한 테스트 코드를 작성한다.
 */
public class passwordValidatorTest {

    @DisplayName("비밀번호가 최소 8자리 이상 12자리 이하면 예외가 발생하지 않는다.")
    @Test
    void validatePasswordTest() {
        assertThatCode(() -> passwordValidator.validate("serverwizard")).doesNotThrowAnyException();

    }

    @DisplayName("비밀번호가 8자리 미만 12자리 초과면 illegalArgumentException 발생")
    @Test
    void validatePasswordTest2() {
        assertThatCode(() -> passwordValidator.validate("aabb"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("비밀번호는 최소 8자 이상 12자 이하여야 한다.");
    }

}
