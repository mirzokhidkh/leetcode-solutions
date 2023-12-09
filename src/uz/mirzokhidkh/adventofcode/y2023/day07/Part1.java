package uz.mirzokhidkh.adventofcode.y2023.day07;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Part1 {


    public static void main(String[] args) throws IOException {

        //https://adventofcode.com/2023/day/9/
        Scanner sc = new Scanner(new File("src/uz/mirzokhidkh/adventofcode/y2023/day07/input"));
//        Scanner sc = new Scanner(new File("src/uz/mirzokhidkh/adventofcode/y2023/day07/test"));

        List<CardHand> cardHands = new ArrayList<>();
        while (sc.hasNext()) {
            String[] handBid = sc.nextLine().split(" ");
            cardHands.add(new CardHand(handBid[0], Integer.parseInt(handBid[1]), getCardType(handBid[0])));
        }

        Map<Character, Integer> strength = strength();

        cardHands.sort((o1, o2) -> {
            if (o1.cardType != o2.cardType) {
                return o1.cardType.ordinal() - o2.cardType.ordinal();
            }

            for (int i = 0; i < 5; i++) {
                char ch1 = o1.cards.charAt(i);
                char ch2 = o2.cards.charAt(i);
                if (ch1 != ch2) {
                    return strength.get(ch1) - strength.get(ch2);
                }
            }
            return 0;

        });

        int sum = 0;
        for (int i = 0; i < cardHands.size(); i++) {
            sum += cardHands.get(i).bid * (i + 1);
        }


        System.out.println("total winnings = " + sum);

    }


    public static Map<Character, Integer> strength() {
        Map<Character, Integer> strength = new HashMap<>();
        strength.put('A', 14);
        strength.put('K', 13);
        strength.put('Q', 12);
        strength.put('J', 11);
        strength.put('T', 10);
        strength.put('9', 9);
        strength.put('8', 8);
        strength.put('7', 7);
        strength.put('6', 6);
        strength.put('5', 5);
        strength.put('4', 4);
        strength.put('3', 3);
        strength.put('2', 2);

        return strength;
    }


    static CardType getCardType(String card) {
        Map<Character, Integer> cardCound = new HashMap<>();
        for (char c : card.toCharArray()) {
            cardCound.compute(c, (k, v) -> v == null ? 1 : v + 1);
        }

        if (cardCound.size() == 1) {
            return CardType.FIVE_OF_A_KIND;
        } else if (cardCound.size() == 2) {
            if (cardCound.containsValue(4)) {
                return CardType.FOUR_OF_A_KIND;
            }
            return CardType.FULL_HOUSE;
        } else if (cardCound.size() == 3) {
            if (cardCound.containsValue(3)) {
                return CardType.THREE_OF_A_KIND;
            }
            return CardType.TWO_PAIR;

        } else if (cardCound.size() == 4) {
            return CardType.ONE_PAIR;
        }

        return CardType.HIGH_CARD;
    }

}
