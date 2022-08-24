package nextstep.leveltwo;

import nextstep.leveltwo.card.Card;
import nextstep.leveltwo.card.Deck;

public class BlackJackGame {

    private Players players;
    private CardsOfMembers cardsOfMembers;
    private Deck deck;  //이건 테스트를 위해 정적 클래스로 안만들었으니 예외로 치자 ㅎㅎ...

    public BlackJackGame(Players players) {
        this.players = initPlayers(players);
        this.cardsOfMembers = new CardsOfMembers(players.getNames());
        this.deck = new Deck();
    }

    private Players initPlayers(Players players) {
        players.getPlayers().add(new Dealer());
        return players;
    }

    public void addTwoCardToCardsOfMembers() {
        for (int i = 0; i < 2; i++) {
            addCardToCardsOfMembers();
        }
    }

    private void addCardToCardsOfMembers(){
        players.getNames()
                .stream()
                .forEach(name -> cardsOfMembers.addCard(name, getCard()));
    }

    public Card getCard(){
        return deck.getCard();
    }

    public Players getPlayers() {
        return players;
    }

    public CardsOfMembers getCardsOfMembers() {
        return cardsOfMembers;
    }
}
