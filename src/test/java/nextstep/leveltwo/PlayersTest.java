package nextstep.leveltwo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class PlayersTest {

    @Test
    void createPlayers(){
        //given
        List<BasePlayer> playerList = Arrays.asList(new Player("su", 10000), new Player("bin", 20000));

        //when
        Players players = new Players(playerList);

        //then
        assertThat(players.getPlayers().get(0).getName()).isEqualTo("su");
        assertThat(players.getPlayers().get(1).getName()).isEqualTo("bin");
    }

    @Test
    void getPlayersName(){
        //given
        List<BasePlayer> playerList = Arrays.asList(new Player("su", 10000), new Player("bin", 20000));
        Players players = new Players(playerList);

        //when
        List<String> names = players.getNames();

        //then
        assertThat(names.get(0)).isEqualTo("su");
        assertThat(names.get(1)).isEqualTo("bin");
    }
}
