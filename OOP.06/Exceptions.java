/*  Create a method for calculating the area of a rectangle
    int squareRectangle(int a, int b),
    which should throw an exception if the user enters negative value.
    Input values a and b from console.
    Check the squareRectangle method in the method main. Check to input nonnumeric value. */

public class Exceptions {

    public static int squareRectangle(int a, int b) throws Exception{
    if (a<=0 | b<=0) throw new Exception("Число не може бути меньше нуля");
    return a*b;
}
}
