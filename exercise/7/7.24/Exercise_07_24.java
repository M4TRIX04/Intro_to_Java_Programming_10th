/**
 *
 *  7.24
 * （仿真：优惠券收集人问题）优惠券收集人问题是一个经典的统计问题，它有很多实际应用。这个问题重复地从一套象中拿出一个对象，
 *  然后找到要将所有需要拿出的对象都至少拿出来一次，需要拿多少次。从该问题衍生出的类似问题就是，从一副打乱的52张牌中重复选
 *  牌，找出在看到每种花色都有一张出现前，需要选多少次。假设在选下一张牌之前的那张牌背面向上的。编写程序，模拟要得到四张不
 *  同花色的牌需要的选取次数，然后显示选中的四张牌（有的可能一张牌被选了两次）。
 *
 */
 
public class Exercise_07_24 {
    public static void main(String[] args) {

        boolean spades = false;
        boolean hearts = false;
        boolean diamond = false;
        boolean clubs = false;

        String[] cardSequence = new String[4];
        int index = 0;
        int pickCount = 0;
        while (!spades || !hearts || !diamond || !clubs) {

            String card = whichCard(pick());
            pickCount++;


            if (card.contains("Spades") && !spades) {
                cardSequence[index++] = card;
                spades = true;
            } else
            if (card.contains("Hearts") && !hearts) {
                cardSequence[index++] = card;
                hearts = true;
            } else
            if (card.contains("Diamond") && !diamond) {
                cardSequence[index++] = card;
                diamond = true;
            } else
            if (card.contains("Clubs") && !clubs) {
                cardSequence[index++] = card;
                clubs = true;
            }

        }

        for (int i = 0; i < cardSequence.length; i++) {
            System.out.println(cardSequence[i]);
        }
        System.out.println("Pick count = " + pickCount);
    }
    public static int pick() {
        return (int)(Math.random() * 52);
    }
    public static String whichCard(int x) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String suit = suits[x / 13];
        String rank = ranks[x % 13];
        return rank + " of " + suit;
        
    }
}