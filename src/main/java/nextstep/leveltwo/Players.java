package nextstep.leveltwo;

import java.util.ArrayList;
import java.util.List;

public class Players {

    private List<BasePlayer> players;

    public Players(List<BasePlayer> players) {
        this.players = players;
    }

    public List<BasePlayer> getPlayers() {
        return players;
    }

    public List<String> getNames() {
        List<String> names = new ArrayList<>();
        for (BasePlayer player : players) {
            names.add(player.getName());
        }
        return names;
    }
}
