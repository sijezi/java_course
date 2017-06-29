package com.layth;

public class Main {

    public static void main(String[] args) {
	    // The String Data Type
        String myString = "this is a string";
        System.out.println("This is myString" + myString);
        String numberString = "250.55";
        numberString = numberString + "30.99";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("This my lastString :" + lastString);

        double doubleNumber = 120.47;

        lastString = lastString + doubleNumber;
        System.out.println(lastString);
    }
}
