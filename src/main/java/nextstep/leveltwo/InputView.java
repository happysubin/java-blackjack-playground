package nextstep.leveltwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private Scanner scanner = new Scanner(System.in);

    public static final String INPUT_PLAYER_NAME_ANNOUNCEMENT_MESSAGE = "게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)";
    public static final String INPUT_PLAYER_MONEY_ANNOUNCEMENT_MESSAGE = "의 배팅 금액은?";


    public Players getPlayers() {
        List<String> names = getNames();
        List<Integer> moneys = getMoneys(names);
        return new Players(createMembers(names, moneys));
    }

    private List<Player> createMembers(List<String> names, List<Integer> moneys) {
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < names.size(); i ++) {
            players.add(new Player(names.get(i), moneys.get(i)));
        }
        return players;
    }


    public List<String> getNames() {
        return splitAndGetNameList();
    }

    public List<String> splitAndGetNameList(){
        return Arrays.asList(getNameString().split(","));
    }

    public String getNameString(){
        System.out.println(INPUT_PLAYER_NAME_ANNOUNCEMENT_MESSAGE);
        return scanner.next();
    }

    public List<Integer> getMoneys(List<String> names) {
        List<Integer> moneys = new ArrayList<>();
        for(int i = 0 ; i < names.size(); i++){
            System.out.println(names.get(i) + INPUT_PLAYER_MONEY_ANNOUNCEMENT_MESSAGE);
            moneys.add(getMoney());
        }
        return moneys;
    }

    public int getMoney(){
        return scanner.nextInt();
    }
}
