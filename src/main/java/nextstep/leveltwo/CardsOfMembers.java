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

    public void addCard(String name, Card card) {
        cardsOfMembers.get(name).add(card);
    }

    public int getCardsTotalScore(String name) {
        return  cardsOfMembers.get(name)
                .stream()
                .map(card -> card.getScore())
                .reduce(0, (sum, cardScore) -> sum + cardScore);
    }

    //최대한 게터는 테스트에서만 사용하기
    public Map<String, List<Card>> getCardsOfMembers() {
        return cardsOfMembers;
    }
}
