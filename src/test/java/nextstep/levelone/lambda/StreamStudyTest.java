package nextstep.levelone.lambda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamStudyTest {
    private List<Integer> numbers;

    @BeforeEach
    public void setup() {
        numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    }

    @Test
    public void countWords() throws Exception {
        long result = StreamStudy.countWords();
        System.out.println("result : " + result);
    }

    @Test
    public void printLongestWordTop100() throws Exception {
        StreamStudy.printLongestWordTop100();
    }

    @Test
    public void map() throws Exception {
        List<Integer> doubleNumbers = StreamStudy.doubleNumbers(numbers);
        doubleNumbers.forEach(System.out::println);
    }

    @Test
    public void sumAll() throws Exception {
        long sum = StreamStudy.sumAll(numbers);
        assertThat(sum).isEqualTo(21);
    }


    /**
     * List에 담긴 모든 숫자 중 3보다 큰 숫자를 2배 한 후 모든 값의 합을 구한다. 지금까지 학습한 map, reduce, filter를 활용해 구현해야 한다.
     * sumOverThreeAndDouble() 테스트를 pass해야 한다.
     *
     */
    @Test
    public void sumOverThreeAndDouble() throws Exception {
        numbers = Arrays.asList(3, 1, 6, 2, 4, 8);
        long sum = StreamStudy.sumOverThreeAndDouble(numbers);
        assertThat(sum).isEqualTo(36);
    }
}