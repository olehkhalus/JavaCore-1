//Create an array of ten integers. Display 
//the biggest of these numbers;
//        the sum of positive numbers in the array;
//        the amount of negative and positive numbers in the array.
//            What values there are more: negative or positive?

package Home_Work3;

public class Presentation4_Task2 {
    public static void main (String[] args) {

        // initialization and displaying array

        int[] array1 = new int[10];
        for (int i = 0 ; i <array1.length; i++) {
            array1[i] = (int)(Math.random()*19)-9;    // random natural one-digit numbers
            System.out.print(array1[i]+" ");
        }

        // sum of positive numbers in array

        int sum = 0;
        int max = 0;
        int number_of_positive = 0;
        int number_of_negative = 0;

        for (int i = 0 ; i <array1.length; i++) {

            if ( array1[i] > 0 ) {
                number_of_positive++;
                sum = sum + array1[i];
            } else if ( array1[i] < 0) {
                number_of_negative++;
            }

            if ( array1[i] > max ) {
                max = array1[i];
            }

        }

        System.out.println();
        System.out.println("Найбільше число "+max);
        System.out.println("Позитивних чисел "+number_of_positive);
        System.out.println("Негативних чисел "+number_of_negative);
        System.out.println("Сума позитивних чисел "+sum);

        if ( number_of_positive > number_of_negative ) {
            System.out.println("Позитивних чисел більше ніж негативних");
        } else if ( number_of_positive < number_of_negative ) {
            System.out.println("Негативних чисел більше ніж позитивних");
        } else {
            System.out.println("Позитивних та негативних чисел порівну");
        }

    }
}
