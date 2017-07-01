package com.layth;

public class Main {

    public static void main(String[] args) {
        // method overloading : same method name with different params
        int newScore =  calculateScore("Layth", 500);
        System.out.println("New Score " + newScore);
        calculateScore(75);
        calculateScore();

        calcFeetAndInchesToCentimeters(6,0);
    } // End of main

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


    // challenge
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0)) && ((inches > 12))) {
            // no more processing
            System.out.println("Invalid feeet or inches parameters");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + "  feet " + inches + " inches " + centimeters + " centimeters");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0) {
            return -1;
        }

        double feet =  (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " is equal to " + feet " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters();
    }


} // End of Class
