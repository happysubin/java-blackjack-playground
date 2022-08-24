package nextstep.leveltwo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CardsOfMembersTest {
    @Test
    void members() {
        //given
        List<Player> playerList = Arrays.asList(new Player("su", 10000), new Player("bin", 20000));
        Players players = new Players(playerList);

        //when
        CardsOfMembers cardsOfMembers = new CardsOfMembers(players.getNames());

        //then
        Assertions.assertThat(cardsOfMembers.getCardsOfMembers().size()).isEqualTo(2);
    }
}
