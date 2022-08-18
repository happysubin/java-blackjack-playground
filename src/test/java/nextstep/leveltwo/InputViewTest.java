package nextstep.leveltwo;

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

        int numberOfPlayer = inputView.getNames().size();

        //given
        List<Integer> moneys = inputView.getMoneys(numberOfPlayer);

        assertThat(moneys.get(0)).isEqualTo(10000);
        assertThat(moneys.get(1)).isEqualTo(10000);
        assertThat(moneys.size()).isEqualTo(numberOfPlayer);

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
        List<Player> players = inputView.getPlayers();

        //then
        assertThat(players.get(0).getMoney()).isEqualTo(10000);
        assertThat(players.get(0).getName()).isEqualTo("pobi");

        assertThat(players.get(1).getName()).isEqualTo("jason");
        assertThat(players.get(1).getMoney()).isEqualTo(10000);

    }
}
