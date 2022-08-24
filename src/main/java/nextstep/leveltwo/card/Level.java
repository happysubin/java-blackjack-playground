package nextstep.leveltwo.card;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum Level {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10);

    private final int score;

    Level(int score) {
        this.score = score;
    }

    public static List<Level> getLevelList(){
        return Arrays.stream(values())
                .collect(Collectors.toList());
    }

    public int getScore() {
        return score;
    }
}
