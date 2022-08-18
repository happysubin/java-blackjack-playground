package nextstep.leveltwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private Scanner scanner = new Scanner(System.in);

    public List<Player> getPlayers() {
        List<String> names = getNames();
        List<Integer> moneys = getMoneys(names.size());
        return createMembers(names, moneys);
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
        return scanner.next();
    }

    public List<Integer> getMoneys(int numberOfPlayer) {
        List<Integer> moneys = new ArrayList<>();
        for(int i = 0 ; i < numberOfPlayer; i++){
            moneys.add(getMoney());
        }
        return moneys;
    }

    public int getMoney(){
        return scanner.nextInt();
    }
}
