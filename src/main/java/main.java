import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Tom on 10/23/16.
 */
public class main {


    public static void main(String[] args) {

        Kata.title();
        System.out.println();
        System.out.println();
        System.out.println("Speeding:");
        speedingTicket();
        speedingTicketTwo();
        speedingTicketThree();
        speedingTicketFour();
        System.out.println();
        System.out.println("Sum Sometimes:");
        sumSometimes();
        sumSometimesTwo();
        System.out.println();
        System.out.println("Love 6:");
        love6();
        love6Two();
        love6Three();
        System.out.println();
        System.out.println("BlackJack");
        blackjack();

    }

    public static void speedingTicket() {
        int speed = 60;
        boolean birthday = true;
        int answer = Kata.speedLogic(speed, birthday);
        System.out.printf("caughtSpeeding(%s, %s) -> %s", speed, birthday, answer);
        System.out.println();

    }

    public static void speedingTicketTwo() {
        int speed = 65;
        boolean birthday = true;
        int answer = Kata.speedLogic(speed, birthday);
        System.out.printf("caughtSpeeding(%s, %s) -> %s", speed, birthday, answer);
        System.out.println();
    }

    public static void speedingTicketThree() {
        int speed = 76;
        boolean birthday = false;
        int answer = Kata.speedLogic(speed, birthday);
        System.out.printf("caughtSpeeding(%s, %s) -> %s", speed, birthday, answer);
        System.out.println();
    }

    public static void speedingTicketFour() {
        int speed = 99;
        boolean birthday = false;
        int answer = Kata.speedLogic(speed, birthday);
        System.out.printf("caughtSpeeding(%s, %s) -> %s", speed, birthday, answer);
        System.out.println();
        System.out.println();
        System.out.println();

    }

    public static void sumSometimes() {
        int one = 1;
        int two = 4;
        int answer = Kata.sumSometimes(one, two);
        System.out.printf("sortaSum(%s , %s ) -> %s", one, two, answer);
        System.out.println();
    }

    public static void sumSometimesTwo() {
        int one = 11;
        int two = 2;
        int answer = Kata.sumSometimes(one, two);
        System.out.printf("sortaSum(%s , %s ) -> %s", one, two, answer);
        System.out.println();
        System.out.println();
        System.out.println();

    }

    public static void love6() {
        int one = 10;
        int two = 3;
        boolean answer = Kata.love6(one, two);
        System.out.printf("Love6(%s , %s ) -> %s", one, two, answer);
        System.out.println();

    }

    public static void love6Two() {
        int one = -2;
        int two = 6;
        boolean answer = Kata.love6(one, two);
        System.out.printf("Love6(%s , %s ) -> %s", one, two, answer);
        System.out.println();

    }

    public static void love6Three() {
        int one = -3;
        int two = -3;
        boolean answer = Kata.love6(one, two);
        System.out.printf("Love6(%s , %s ) -> %s", one, two, answer);
        System.out.println();

    }

    public static void blackjack() {
        Integer[] Player = {20,2,3};
        Integer[] Dealer = {1,10,10};
        String answer = Kata.blackJack(Player, Dealer);
        System.out.println();
        System.out.printf("blackJack(%s, %s ) -> %s", Arrays.toString(Player), Arrays.toString(Dealer), answer);
    }

}

