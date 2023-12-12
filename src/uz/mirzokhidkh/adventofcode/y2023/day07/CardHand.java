package uz.mirzokhidkh.adventofcode.y2023.day07;

public class CardHand {

    public String cards;
    public int bid;
    public CardType cardType;

    public CardHand(String cards, int bid, CardType cardType) {
        this.cards = cards;
        this.bid = bid;
        this.cardType = cardType;
    }
}
