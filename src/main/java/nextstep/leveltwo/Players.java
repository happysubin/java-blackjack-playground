package nextstep.leveltwo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Players {

    private List<BasePlayer> players;

    public Players(List<BasePlayer> players) {
        this.players = players;
    }

    public List<BasePlayer> getPlayers() {
        return players;
    }

    public List<String> getNames() {
        return players.stream()
                .map(player -> player.getName())
                .collect(Collectors.toList());
    }
}
