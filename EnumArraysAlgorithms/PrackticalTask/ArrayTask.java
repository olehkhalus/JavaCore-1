package EnumArraysAlgorithms.PrackticalTask;

public class ArrayTask {

    public static void main(String[] args) {

        int [] arr = {5,23,-5,46,-33,-15,5,20,1,27};

        //Search the biggest number

        int max = arr[0];
        int i = 0;
        while (i<arr.length){
           if (arr[i] > max){
               max = arr[i];
           }
           i++;
         }
        System.out.println("The biggest number is "+max);


        //Search the sum of positive numbers in the array

        int posetiveSum = 0;
        int negativeSum = 0;
        for (int sum: arr){
            if (sum > 0){
                posetiveSum +=sum;
            } else {
                negativeSum +=sum;
            }
        }
        System.out.println("Sum of positive numbers: "+posetiveSum);
        System.out.println("Sum of negative numbers: "+negativeSum);

        //the amount of negative and positive numbers in the array

        int posetiveNumbers = 0;
        int negativeNumbers = 0;
        for (int number: arr){
            if (number > 0){
                posetiveNumbers = posetiveNumbers+1;
            } else {
                negativeNumbers = negativeNumbers+1;
            }
        }
        System.out.println("Amount of positive numbers: "+posetiveNumbers);
        System.out.println("Amount of negative numbers: "+negativeNumbers);

        //What values there are more: negative or positive?
        System.out.println(posetiveNumbers>negativeNumbers ? "Posetive numbers are more" : "Negative numbers are more");

    }
}
