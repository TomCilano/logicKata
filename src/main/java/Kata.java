import javax.smartcardio.Card;
import java.util.ArrayList;

/**
 * Created by Tom on 10/23/16.
 */
public class Kata {


    public static int speedLogic(int speed, boolean Birthday) {
        int mySpeed = speed;
        if (Birthday == true) {
            mySpeed = speed - 5;
        }
        if (mySpeed <= 60) {
            return 0;
        } else if (mySpeed <= 80) {
            return 1;
        }
        return 2;
    }

    /**
     * Given 2 ints, a and b, return their sum. However, sums in the range
     * 10...19 inclusive, are forbidden, so in that case just return 20.
     *
     * @param one
     * @param two
     * @return
     */
    public static int sumSometimes(int one, int two) {

        if (one + two <= 9 || one + two >= 20) {
            int x = one + two;
            return x;
        } else {
            return 20;
        }
    }

    /**
     * The number 6 is a truly great number. Given two int values,
     * a and b, return true if either one is 6. Or if their sum or
     * difference is 6. Note: the function Math.abs(num) computes the
     * absolute value of a number.
     *
     * @param one
     * @param two
     * @return
     */
    public static boolean love6(int one, int two) {
        if (Math.abs(one) == 6 || Math.abs(two) == 6) {
            return true;
        } else if (Math.abs(one) + Math.abs(two) == 6 || Math.abs(one) + Math.abs(two) == 6) {
            return true;
        } else {
            return false;
        }
    }


    public static String blackJack(Integer[] card, Integer[] cardtwo) {
        int sum = 0;
        int sumTwo = 0;
        for (int i = 0; i < card.length; i++) {
            sum += card[i];
        }
        for (int i = 0; i < cardtwo.length; i++) {
            sumTwo += cardtwo[i];
        }
        if (sum>21){
            return "Dealer Wins";
        }
        if (sumTwo > 21) {
            return "Player Wins";
        }
        if (sum > 21 && sumTwo > 21) {
            return "Player wins";
        } else if (sum == 21 && sumTwo == 21) {
            return "Player wins- BlackJack!";
        } else if (sum >= sumTwo) {
            return "Player wins";
        } else {
        }
        return "Dealer Wins";
    }


    public static void title() {
        System.out.print("    __    ____  ________________   __ __ ___  _________ \n" +
                "   / /   / __ \\/ ____/  _/ ____/  / //_//   |/_  __/   |\n" +
                "  / /   / / / / / __ / // /      / ,<  / /| | / / / /| |\n" +
                " / /___/ /_/ / /_/ // // /___   / /| |/ ___ |/ / / ___ |\n" +
                "/_____/\\____/\\____/___/\\____/  /_/ |_/_/  |_/_/ /_/  |_|\n" +
                "                                                        ");
    }
}