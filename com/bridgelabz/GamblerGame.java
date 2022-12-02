package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Govardhan Reddy
 */
public class GamblerGame {
    /**
     * solve the gambler gaming techniques
     */

    public static int amountAtDayStarting = 100;

    public static int everyDayGame() {
        int initialAmount = 100;
        int eachGameBet = 1;
        int eachDayGame = 1;
        while (eachDayGame != 0) {
            if (initialAmount == amountAtDayStarting * 0.5 || initialAmount == amountAtDayStarting * 1.5) {
                break;
            }
            double randomValue = Math.random();
            if (randomValue > 0.5) {
                initialAmount += eachGameBet;
            } else {
                initialAmount -= eachGameBet;
            }
            eachDayGame++;
        }
        System.out.println("Number of games played : " + eachDayGame);
        System.out.println("End of the day amount is " + initialAmount);
        return initialAmount;
    }

    public static void main(String[] args) {
        /**
         * call the everyDayGame in main method
         */
        List<Integer> winDaysList = new ArrayList<>();
        List<Integer> looseDaysList = new ArrayList<>();
        int totalAmountPerMonth = 0;
        int winningDays = 0;
        int loosingDays = 0;
        int monthDays = 20;
        for (int i = 1; i <= monthDays; i++) {
            System.out.println(i + " Day : ");
            int perDayAmount = everyDayGame();
            if (perDayAmount >= 100) {
                winDaysList.add(i);
                winningDays++;
            } else {
                looseDaysList.add(i);
                loosingDays++;
            }
            totalAmountPerMonth += perDayAmount;
        }
        System.out.println("***********************************");
        System.out.println("Total month amount : " + totalAmountPerMonth);
        if ((amountAtDayStarting * monthDays) > totalAmountPerMonth) {
            System.out.println("Total loose amount is " + ((amountAtDayStarting * monthDays) - totalAmountPerMonth));
        } else {
            System.out.println("Total win amount is " + ((totalAmountPerMonth) - (amountAtDayStarting * monthDays)));
        }
        System.out.println("***********************************");
        System.out.println("Winning days : " + winningDays);
        System.out.println("Loosing days : " + loosingDays);
        System.out.println("***********************************");
        System.out.println("Luckiest days list :  " + winDaysList);
        System.out.println("Unluckiest days list : " + looseDaysList);
        System.out.println("***********************************");
        System.out.print("Play for next month : ");
        if (loosingDays > winningDays) {
            System.out.print("Gambler not play for next month");
        } else {
            System.out.print("Gambler play for next month");
        }
    }
}
