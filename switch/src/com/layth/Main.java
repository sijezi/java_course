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
    }
}
