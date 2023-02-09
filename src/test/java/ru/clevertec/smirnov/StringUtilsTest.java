package ru.clevertec.smirnov;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {

    @ParameterizedTest
    @ValueSource(strings = {
            "1.1",
            "2",
            "50000000000"
    })
    void isPositiveNumberTest(String number) {
        assertTrue(StringUtils.isPositiveNumber(number));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "-50000000000",
            "-1",
            "-1.0",
            "0",
            "fhtagn"
    })
    void isNotPositiveNumberTest(String number) {
        assertFalse(StringUtils.isPositiveNumber(number));
    }

    @ParameterizedTest
    @NullSource
    void isNullTest(String number) {
        assertFalse(StringUtils.isPositiveNumber(number));
    }
}
