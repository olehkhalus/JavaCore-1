import java.util.Arrays;

public class Main {

    private static int getMax(int number[]){
        int max = number[0];
        for(int i : number){
            if (i > max)
                max = i;
        }
        return max;
    }

    public static void main(String[] args) {
        int number[] = {-155, -25, -36, -4, 55, -6, 78, 82, -9, -10};
        System.out.println(Arrays.toString(number));
        int sum = 0;
        int x = 0;
        System.out.println("The biggest value: " + getMax(number));

        // for (x = 0 ; x < number.length - 1 ; x++);
        // {
        //     sum += number[x];
        // }
        // System.out.println("Sum =" + sum);

        int allSum = 0;
        for(int i : number) {
            allSum += i;
        }
        System.out.println("Sum all =" + allSum);

        int positiveSum = 0;
        for (int y : number){
            if (y > 0 )
                positiveSum += y;
        }
        System.out.println("Sum positive = " + positiveSum);
    }
}