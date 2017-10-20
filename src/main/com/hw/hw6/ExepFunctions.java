package com.hw.hw6;

public class ExepFunctions {

    /**
     *  Accepts two double values and 
     *  returns it's fraction
     *
     *  @param diviser must not be 0
     *  @return division of two rational numbers
     */
    public static double div(double divident, double diviser) {
        if (diviser != 0) {
            return divident / diviser;
        } else {
            throw new IllegalArgumentException("Diviser cannot be zero");
        }
    } 

    /**
     *  Accepts three integers numbers and checks whether 
     *  num is an integer such that num is greater than or equal to start  is less than or equal to NN
     *  num is an integer such that num is within the interval [start...end]
     *  e.g. num ∈ Z : start ≤ num ≤ end
     * 
     *  @param three integers
     *  @return true if num ∈ Z : start ≤ num ≤ end
     */
    public static boolean readNumber(int start, int end, int num) {
        boolean res = false;
        try {
            res = (num >= start && num <= end); 
        } catch (IllegalArgumentException iae) {
            System.err.println("Illegal argument passed. Three integers are needed");
        } finally {
            return res;
        }
    }

    /**
     *  Accepts two double values and 
     *  returns it's product e.g. rectangle's area
    *
     *  @param a and b must be greater than 0
     *  @return product of two rational numbers
     */
    public static int squareRectangle(int a, int b) {
        verifyArgs(a, b);
        return (int) a * b;
    }
   
    private static void verifyArgs(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Only positive integers are allowed as rectangle's length and width");
        }
    }
}
