package nextstep.leveltwo;

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
}
