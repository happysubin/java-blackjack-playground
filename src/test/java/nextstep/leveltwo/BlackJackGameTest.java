package nextstep.leveltwo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class BlackJackGameTest {

    @Test
    void createGame(){
        //given
        List<Player> playerList = Arrays.asList(new Player("su", 10000), new Player("bin", 20000));
        Players players = new Players(playerList);

        //when
        BlackJackGame blackJackGame = new BlackJackGame(players);

        //then
        assertThat(blackJackGame.getPlayers().getPlayers().size()).isEqualTo(2);
        assertThat(blackJackGame.getCardsOfMembers().getCardsOfMembers().size()).isEqualTo(2);
    }
}
