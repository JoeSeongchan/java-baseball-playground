package string_calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;
    @BeforeEach
    void beforeEach(){
        calculator = new Calculator();
    }
    @ParameterizedTest
    @CsvSource(value={"3 + 4:7","3 + 4 * 2:14","2 + 3 * 4 / 2:10","1:1"}, delimiter = ':')
    void run(String str, int expectedValue) {
        // given

        // when
        int actualValue = calculator.run(str);

        // then
        assertThat(actualValue).isEqualTo(expectedValue);
    }
}