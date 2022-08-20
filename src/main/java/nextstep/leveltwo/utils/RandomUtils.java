package nextstep.leveltwo.utils;

import java.util.Random;

public class RandomUtils {

    private static final Random random = new Random();
    private static final int TRUMP_LEVEL_SIZE = 13;
    private static final int TRUMP_SUIT_SIZE = 4;

    public static int getRandomLevel(){
        return random.nextInt(TRUMP_LEVEL_SIZE);
    }

    public static int getRandomSuit(){
        return random.nextInt(TRUMP_SUIT_SIZE);
    }

}

//int nextInt(int n)
//0~n 미만의 정수형 난수 반환
