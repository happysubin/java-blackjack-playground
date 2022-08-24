package nextstep.leveltwo;

import nextstep.leveltwo.card.Card;
import nextstep.leveltwo.card.Level;
import nextstep.leveltwo.card.Suit;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class CardsOfMembersTest {

    @Test
    void createCardsOfMembers() {

        //given
        List<Player> playerList = Arrays.asList(new Player("su", 10000), new Player("bin", 20000));
        Players players = new Players(playerList);

        //when
        CardsOfMembers cardsOfMembers = new CardsOfMembers(players.getNames());

        //then
        assertThat(cardsOfMembers.getCardsOfMembers().size()).isEqualTo(2);
    }

    @Test
    void addCard() {

        //given
        String name = "su";
        List<Player> playerList = Arrays.asList(new Player(name, 10000), new Player("bin", 20000));
        Players players = new Players(playerList);
        CardsOfMembers cardsOfMembers = new CardsOfMembers(players.getNames());
        Card card = new Card(Suit.CLOVER, Level.ACE);

        //when
        cardsOfMembers.addCard(name, card);

        //then
        assertThat(cardsOfMembers.getCardsOfMembers().get(name)).containsExactly(card);
    }

    @Test
    void getCardsTotalScore() {

        //given
        String name = "su";
        List<Player> playerList = Arrays.asList(new Player(name, 10000), new Player("bin", 20000));
        Players players = new Players(playerList);
        CardsOfMembers cardsOfMembers = new CardsOfMembers(players.getNames());
        Card card1 = new Card(Suit.CLOVER, Level.EIGHT);
        Card card2 = new Card(Suit.CLOVER, Level.JACK);
        cardsOfMembers.addCard(name, card1);
        cardsOfMembers.addCard(name, card2);

        //when
        int finalScore = cardsOfMembers.getCardsTotalScore(name);

        //then
        assertThat(finalScore).isEqualTo(18);
    }
}
