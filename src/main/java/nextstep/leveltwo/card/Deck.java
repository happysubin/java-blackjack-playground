package nextstep.leveltwo.card;

import nextstep.leveltwo.utils.RandomUtils;

import java.util.List;

public class Deck {

    public Card getCard() {
        Level level = getLevel().get(getRandomLevelIndex());
        Suit suit = getSuit().get(getRandomSuitIndex());
        return new Card(suit, level);
    }

    public List<Level> getLevel(){
        return Level.getLevelList();
    }

    public List<Suit> getSuit(){
        return Suit.getSuitList();
    }

    public int getRandomLevelIndex(){
        return RandomUtils.getRandomLevel();
    }

    public int getRandomSuitIndex(){
        return RandomUtils.getRandomSuit();
    }
}
