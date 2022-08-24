package nextstep.leveltwo;

public class Dealer implements BasePlayer {

    private String name;

    public Dealer() {
        this.name = "딜러";
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        throw new UnsupportedOperationException("딜러는 베팅한 금액이 없습니다");
    }

    @Override
    public boolean isDealer() {
        return true;
    }
}
