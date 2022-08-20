package nextstep.leveltwo.card;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum Suit {
    DIAMOND, HEART, CLOVER, SPADE;

    public static List<Suit> getSuitList(){
        return Arrays.stream(values())
                .collect(Collectors.toList());
    }
}
