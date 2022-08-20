package nextstep.leveltwo.card;

public class Card {

    private Suit suit;
    private Level level;

    public Card(Suit suit, Level level) {
        this.suit = suit;
        this.level = level;
    }

    public Suit getSuit() {
        return suit;
    }

    public Level getLevel() {
        return level;
    }
}
