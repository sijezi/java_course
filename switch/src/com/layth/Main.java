package com.layth;

public class Main {

    public static void main(String[] args) {
        // control flow
//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value is 1");
//        } else if(value == 2) {
//            System.out.println("Value is 2");
//        }else {
//            System.out.println("Value is 1 or 2");
//        }
        switchTest();
        int switchValue = 1;
        /* only tests switchValue, it is only good if your testing the same variables
        * byte short char and int
        * */
        switch(switchValue) {
            // if switchValue == 1
            case 1:
                System.out.println("switchValue is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            /* you can test multiple cases */
            case 3:case 6:case 4:
                System.out.println("Value is 3 or 4 or 6");

            default:
                System.out.println("Value was not 1 or 2");
        }

        for (int i = 0; i < 9; i++) {
            System.out.println(" 10,000 at " + i + "% =" + calculateInterest(10000.0, i));
        }
    }

    public static void switchTest() {
        char charValue = 'A';
        switch(charValue) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C':case 'D':case 'E':
                System.out.println(charValue + " was found");
                break;
            default:
                System.out.println("Could not find A, B, C, D, or E");
                break;
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}
