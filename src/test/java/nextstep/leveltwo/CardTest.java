package nextstep.leveltwo;

import nextstep.leveltwo.card.Card;
import nextstep.leveltwo.card.Level;
import nextstep.leveltwo.card.Suit;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CardTest {

    @Test
    @DisplayName("카드를 생성")
    void createCard() {
        //카드를 하나 생성한다.
        Card card = new Card(Suit.CLOVER, Level.ACE);

        Assertions.assertThat(card.getLevel()).isEqualTo(Level.ACE);
        Assertions.assertThat(card.getSuit()).isEqualTo(Suit.CLOVER);
    }
}
