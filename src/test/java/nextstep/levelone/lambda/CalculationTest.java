package nextstep.levelone.lambda;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CalculationTest {

    @Test
    void 연산(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        Assertions.assertThat(sumAll(numbers)).isEqualTo(sumUsingLambda(numbers, (int num) -> true ));
        Assertions.assertThat(sumAllEven(numbers)).isEqualTo(sumUsingLambda(numbers, (int num) -> num % 2 ==0 ));
        Assertions.assertThat(sumMoreThanThree(numbers)).isEqualTo(sumUsingLambda(numbers, (int num) -> num > 3 ));

    }

    public int sumAll(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public int sumAllEven(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                total += number;
            }
        }
        return total;
    }

    public int sumMoreThanThree(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            if (number > 3) {
                total += number;
            }
        }
        return total;
    }

    public int sumUsingLambda(List<Integer> numbers, Condition condition) {
        return numbers.stream()
                .filter(num -> condition.test(num))
                .reduce(0, (x, y) -> x + y);

    }
}

/**
 *
 * reduce()는 파라미터를 3개 받을 수 있다.
 *
 * T identity: 계산에 적용할 초깃값으로, 스트림이 비어 있더라도 초깃값을 반환
 * BinaryOperator<T> accumulator: 적용할 계산 함수
 * BinaryOperator<U> combiner: 병렬 스트림에서 각 쓰레드 계산 결과를 합치는 함수
 */