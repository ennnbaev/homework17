package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidatorTest {
    @Test
    public void CheckSalaryShouldNoException() {
        Assertions.assertDoesNotThrow(() -> Validator.checkSalary(10));
    }

    @Test
    public void CheckSalaryShouldTooSmallSalaryException() {
        Assertions.assertThrows(TooSmallSalaryException.class, () -> Validator.checkSalary(-1));
    }

    @Test
    public void CheckFioShouldImpossibleNameException() {
        Assertions.assertThrows(ImpossibleNameException.class, () -> Validator.checkFio("3п"));
    }

    @Test
    public void CheckFioShouldNoException() {
        Assertions.assertDoesNotThrow(() -> Validator.checkFio("enbaev"));
    }

    @Test
    public void inputNullInfo() {
        Assertions.assertThrows(NullPointerException.class, () -> Validator.checkFio(null));
    }

    @Test
    public void inputString() {
        Assertions.assertThrows(ImpossibleNameException.class, () -> Validator.checkFio(""));
    }
}
