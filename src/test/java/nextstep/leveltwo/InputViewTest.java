package nextstep.leveltwo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

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

        Assertions.assertThat(names.get(0)).isEqualTo("pobi");
        Assertions.assertThat(names.get(1)).isEqualTo("jason");

    }
}
