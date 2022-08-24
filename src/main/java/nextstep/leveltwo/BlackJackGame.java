package nextstep.leveltwo;

public class BlackJackGame {

    private Players players;
    private CardsOfMembers cardsOfMembers;

    public BlackJackGame(Players players) {
        this.players = players;
        this.cardsOfMembers = new CardsOfMembers(players.getNames());
    }

    public Players getPlayers() {
        return players;
    }

    public CardsOfMembers getCardsOfMembers() {
        return cardsOfMembers;
    }
}
