package nextstep.leveltwo;

import nextstep.leveltwo.card.Card;
import nextstep.leveltwo.card.Deck;
import nextstep.leveltwo.card.Level;
import nextstep.leveltwo.card.Suit;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class DeckTest {

    @Test
    void getCardFromDeck() {
        //given
        Deck deck = new Deck(){
            @Override
            public int getRandomLevelIndex() {
                return 0; //ace
            }

            @Override
            public int getRandomSuitIndex() {
                return 0; //DIAMOND
            }
        };

        //when
        Card card = deck.getCard();

        //then
        assertThat(card.getSuit()).isEqualTo(Suit.DIAMOND);
        assertThat(card.getLevel()).isEqualTo(Level.ACE);
    }
}
