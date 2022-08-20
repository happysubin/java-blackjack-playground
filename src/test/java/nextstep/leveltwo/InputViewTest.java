package nextstep.leveltwo;

import nextstep.leveltwo.InputView;
import nextstep.leveltwo.Players;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class InputViewTest {

    @Test
    void inputPlayerName(){
        InputView inputView = new InputView(){
            @Override
            public String getNameString() {
                return "pobi,jason";
            }
        };
        List<String> names = inputView.getNames();

        assertThat(names.get(0)).isEqualTo("pobi");
        assertThat(names.get(1)).isEqualTo("jason");
    }

    @Test
    void inputPlayerMoney(){
        //given

        InputView inputView = new InputView(){

            @Override
            public String getNameString() {
                return "pobi,jason";
            }

            @Override
            public int getMoney() {
                return 10000;
            }
        };

        List<String> names = inputView.getNames();

        //given
        List<Integer> moneys = inputView.getMoneys(names);

        assertThat(moneys.get(0)).isEqualTo(10000);
        assertThat(moneys.get(1)).isEqualTo(10000);
        assertThat(moneys.size()).isEqualTo(names.size());

    }

    @Test
    void inputViewCreatePlayer(){
        //given
        InputView inputView = new InputView(){

            @Override
            public String getNameString() {
                return "pobi,jason";
            }

            @Override
            public int getMoney() {
                return 10000;
            }
        };

        //when
        Players players = inputView.getPlayers();

        //then
        assertThat(players.getPlayers().get(0).getMoney()).isEqualTo(10000);
        assertThat(players.getPlayers().get(0).getName()).isEqualTo("pobi");
        
        assertThat(players.getPlayers().get(1).getName()).isEqualTo("jason");
        assertThat(players.getPlayers().get(1).getMoney()).isEqualTo(10000);

    }
}
