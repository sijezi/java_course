package com.layth;

public class Main {

    public static void main(String[] args) {
        // method overloading : same method name with different params
        int newScore =  calculateScore("Layth", 500);
        System.out.println("New Score " + newScore);
        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored" + score + " points ");
        return score + 1000;
    }

    /**
     *
     * @param score
     * @return
     * The method overloading in Java simply allows to use the same method but with different set of params
     *
     */
    public static int calculateScore(int score) {
        System.out.println("unamed Player " + " scored " + score + " points ");
        return score + 1000;
    }


    //
    public static int calculateScore() {
        System.out.println("No player name, or player score ");
        return 0;
    }

}
