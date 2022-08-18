package nextstep.leveltwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private Scanner scanner = new Scanner(System.in);

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
