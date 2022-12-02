package com.bridgelabz;

/**
 * @author Govardhan Reddy
 */
public class GamblerGame {
    /**
     * solve the gambler gaming techniques
     */
    public static int everyDayGame() {
        int initialAmount = 100;
        int eachGameBet = 1;
        double randomValue = Math.random();
        if (randomValue <= 0.5) {
            initialAmount += eachGameBet;
        } else {
            initialAmount -= eachGameBet;
        }
        return initialAmount;
    }

    public static void main(String[] args) {
        /**
         * call the everyDayGame in main method
         */
        int amountAtDayEnd = everyDayGame();
        System.out.println("End of the amount is " + amountAtDayEnd);
    }
}
