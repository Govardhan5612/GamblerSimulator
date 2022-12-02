package com.bridgelabz;

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
        int totalAmountPerMonth = 0;
        int winningDays = 0;
        int loosingDays = 0;
        int monthDays = 20;
        for (int i = 1; i <= monthDays; i++) {
            System.out.println(i + " Day : ");
            int perDayAmount = everyDayGame();
            if (perDayAmount >= 100) {
                winningDays++;
            } else {
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
    }
}
