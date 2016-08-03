/**
 *
 *  7.24
 * �����棺�Ż�ȯ�ռ������⣩�Ż�ȯ�ռ���������һ�������ͳ�����⣬���кܶ�ʵ��Ӧ�á���������ظ��ش�һ�������ó�һ������
 *  Ȼ���ҵ�Ҫ��������Ҫ�ó��Ķ��������ó���һ�Σ���Ҫ�ö��ٴΡ��Ӹ�����������������������ǣ���һ�����ҵ�52�������ظ�ѡ
 *  �ƣ��ҳ��ڿ���ÿ�ֻ�ɫ����һ�ų���ǰ����Ҫѡ���ٴΡ�������ѡ��һ����֮ǰ�������Ʊ������ϵġ���д����ģ��Ҫ�õ����Ų�
 *  ͬ��ɫ������Ҫ��ѡȡ������Ȼ����ʾѡ�е������ƣ��еĿ���һ���Ʊ�ѡ�����Σ���
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