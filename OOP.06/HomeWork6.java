/*Create method div(), which calculates the dividing of two double numbers.
In main method input 2 double numbers and call this method. Catch all exceptions.
 */

/*Write a method readNumber(int start, int end),
that read from console integer number and return it, if it is in the range [start ... end].
If an invalid number or non-number text is read, the method should throw an exception.
Using this method write a method main(), that has to enter 10 numbers:
	a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100 */

public class HomeWork6 {

    public static double div(double firstNum, double secondNum)throws Exception{
        if (secondNum==0) throw new Exception("secondNum cannot we'll be 0");
        return firstNum/secondNum;
    }

    public static int readNumber(int start, int end, int number)throws Exception{
        if(number<start || number> end) throw new Exception("value of "+number+ " is out of range");
        return number;
    }
}
