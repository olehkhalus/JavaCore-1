package homework3;
/*
Create an array of ten integers. Display 
-the biggest of these numbers;
-the sum of positive numbers in the array;
-the amount of negative and positive numbers in the array.
    What values there are more: negative or positive?
 */
public class Array {

    public static void main(String[] args) {
        int[] array =  {1,3,4,-6,-23, 5, 4, -2, -3,-1};
        int max = array [0];
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if (array[i] > max) {
                max = array[i];
            }

        }
        System.out.println("Максимальный элемент в массиві array: " + max);
        for (int i = 0; i < array.length; i++){
            if (array[i]<0){
                count ++;

            } else if (array[i]>0){
                count2++;
            }
        }
        System.out.println("Відєних елементів: " + count);
        System.out.println("Додатніх елементів: " + count2);
    }
}
