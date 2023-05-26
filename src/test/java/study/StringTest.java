package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split(){
        // 요구사항 1 : "1,2"을 ","로 split했을 때 1과 2로 잘 분리되는지 학습 테스트
        // given
        String value="1,2";
        String[] expectedValue=new String[]{"1","2"};

        // when
        String[] actualValue = value.split(",");

        // then
        assertThat(actualValue).contains(expectedValue);
        assertThat(actualValue).containsExactly(expectedValue);
    }

    @Test
    void substring(){
        // 요구사항 2 : '(1,2)' 값이 주어졌을 때 String의 substring() 메소드를 활용해 ()을 제거하고 "1,2"를 반환되는지 학습 테스트
        // given
        String value="(1,2)";
        String expectedValue = "1,2";

        // when
        String actualValue = value.substring(1,4);

        // then
        assertThat(actualValue).isEqualTo(expectedValue);
    }

    @Test
    @DisplayName("String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져올 때 위치 값을 벗어나면 StringIndexOutOfBoundsException이 발생")
    void charAt(){
        // 요구사항 2 : "abc" 값이 주어졌을 때 String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져오는 학습 테스트
        // given
        String value="abc";

        // when & then
        assertThatThrownBy(()->{
            value.charAt(3);
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("range: 3");
    }

    @Test
    @DisplayName("assertThatExceptionOfType 사용해서 테스트")
    void charAtUsingAssertThatExceptionOfType(){
        // given (준비)
        String value = "abc";

        // when (실행) & then (검증)
        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
                .isThrownBy(()->{
                    value.charAt(3);
                }).withMessageMatching(".*range: \\d+.*");
    }
}
