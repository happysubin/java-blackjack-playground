package nextstep.leveltwo;

import nextstep.leveltwo.card.Card;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CardsOfMembers {

    private Map<String, List<Card>> cardsOfMembers;

    public CardsOfMembers(List<String> names) {
        this.cardsOfMembers = initCardsOfMembers(names);
    }

    private Map<String, List<Card>> initCardsOfMembers(List<String> names) {
        Map<String, List<Card>> result = new HashMap<>();
        for (String name : names) {
            result.put(name, new ArrayList<>());
        }
        return result;
    }

    public Map<String, List<Card>> getCardsOfMembers() {
        return cardsOfMembers;
    }

    public void addCard(String su, Card card) {
        cardsOfMembers.get(su).add(card);
    }
}
