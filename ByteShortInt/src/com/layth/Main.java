package com.layth;

public class Main {

    public static void main(String[] args) {
        // you may also use underscore to make number readable => -2_147_483_648
        // int has width of 32
        int minValue = -2147483648;
        int maxValue = 2147483648;

        // byte has a width of 8
        byte minByte  = -128;
        byte maxByte = 128;

        // short has a width of 16
        short minShortType = -32767;
        short maxShortType = 32767;

        // number longer than int, always put 'L' has a width of 64
        long myLongValue =  100L;
    }
}
