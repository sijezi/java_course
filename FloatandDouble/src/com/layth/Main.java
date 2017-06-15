package com.layth;

public class Main {

    public static void main(String[] args) {
	    // Float number vs int
        // int width of 32 (4 bytes)
        int myIntValue = 5/ 2;
        // width of flaot is 32 (4 bytes)
        float myFloatValue = 5f / 2f;
        // with of double is 64 (8 bytes)
        double myDoubleValue = 5d / 2d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double numPounds = 200d;
        double convertedKilo = numPounds * 0.4553445d;
        System.out.println("Kilograms = " + convertedKilo);

    }
}
