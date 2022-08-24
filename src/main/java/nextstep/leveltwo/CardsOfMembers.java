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

    public void addCard(String su, Card card) {
        cardsOfMembers.get(su).add(card);
    }

    public int getCardsTotalScore(String name) {
        List<Card> cards = cardsOfMembers.get(name);
        int result = 0;
        for (Card card : cards) {
            result += card.getScore();
        }
        return result;
    }

    //최대한 게터는 테스트에서만 사용하기
    public Map<String, List<Card>> getCardsOfMembers() {
        return cardsOfMembers;
    }
}
