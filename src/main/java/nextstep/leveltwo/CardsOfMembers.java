package nextstep.leveltwo;

import nextstep.leveltwo.card.Card;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CardsOfMembers {

    private Players players;
    private Map<String, List<Card>> cardsOfMembers;

    public CardsOfMembers(Players players) {
        this.players = players;
        this.cardsOfMembers = initCardsOfMembers(players.getNames());
    }

    private Map<String, List<Card>> initCardsOfMembers(List<String> names) {
        Map<String, List<Card>> result = new HashMap<>();
        for (String name : names) {
            result.put(name, new ArrayList<>());
        }
        return result;
    }

    public Players getPlayers() {
        return players;
    }

    public Map<String, List<Card>> getCardsOfMembers() {
        return cardsOfMembers;
    }
}
