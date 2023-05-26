package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp(){
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
    }

    @Test
    @DisplayName("Set의 size() 메소드를 활용해 Set의 크기를 확인하는 학습테스트")
    void size(){
        // given
        int expectedValue = 4;

        // when
        int actualValue = numbers.size();

        // then
        assertThat(actualValue).isEqualTo(expectedValue);
    }

    @DisplayName("Set의 contains() 메소드를 활용해 1, 2, 3의 값이 존재하는지를 확인하는 학습테스트")
    @ParameterizedTest
    @ValueSource(ints={1,2,3})
    void contains(int v){
        // when & then
        assertThat(numbers.contains(v)).isTrue();
    }

    @DisplayName("입력 값에 따라 결과 값이 다른 경우에 대한 학습테스트")
    @ParameterizedTest
    @CsvSource(value={"1:true","2:true","3:true","4:true","5:false"}, delimiter = ':')
    void contains_ShouldGenerateExpectedSizeOfSet(int value, boolean expectedValue){
        // given

        // when
        boolean actualValue = numbers.contains(value);

        // then
        assertThat(actualValue).isEqualTo(expectedValue);
    }
}
