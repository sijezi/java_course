package com.layth;

public class Main {

    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
	    // width of 16 ( 2 bytes)
        char myChar = '\u00A9';
        System.out.println("Unicode Character " + myChar);

        boolean myBoolean = false;

        String myString = "This is a string";

        System.out.println("myString is equal" + myString);

        String numberString = "20.00";

        numberString = numberString + "2";

        System.out.println(numberString);

        char registeredSymbol = '\u000AE';

    }
}
