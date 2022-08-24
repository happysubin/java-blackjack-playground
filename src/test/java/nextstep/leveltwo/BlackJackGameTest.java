package nextstep.leveltwo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class BlackJackGameTest {

//    @Test
//    void createGame(){
//        //given
//        List<BasePlayer> playerList = Arrays.asList(new Player("su", 10000), new Player("bin", 20000));
//        Players players = new Players(playerList);
//
//        //when
//        BlackJackGame blackJackGame = new BlackJackGame(players);
//
//        //then
//        assertThat(blackJackGame.getPlayers().getPlayers().size()).isEqualTo(3);
//        assertThat(blackJackGame.getCardsOfMembers().getCardsOfMembers().size()).isEqualTo(3);
//    }
    /**
     * 위의 코드에서 아래와 같은 에러가 발생  Arrays.asList(new Player("su", 10000), new Player("bin", 20000)); 이 코드가 동적인 리스트를 생성하는 것이 아니라, 정적인 리스트를 생성한다고 한다.
     * 그래서 오류가 발생했다. 그러므로 아래와 같이 코드를 수정해야 한다.
     */

    @Test
    void createGame(){
        //given
        List<BasePlayer> playerList = new ArrayList<>();
        playerList.add(new Player("su", 10000));
        playerList.add(new Player("bin", 20000));
        Players players = new Players(playerList);

        //when
        BlackJackGame blackJackGame = new BlackJackGame(players);

        //then
        assertThat(blackJackGame.getPlayers().getPlayers().size()).isEqualTo(3);
        assertThat(blackJackGame.getCardsOfMembers().getCardsOfMembers().size()).isEqualTo(3);
    }
}
