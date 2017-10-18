package JavaCore;

public class TheBiggestNumber2 {


    public static void main(String[] args) {
        int[] array = {2,14,45,-5,12,-3,-25};
        System.out.print(greatestNegative(array));
    }

    static public int greatestNegative(int[] list) {
        int result = 0;
        for (int number:list) {
            if (number < 0) {
                if (result == 0 || number > result) {
                    result = number;
                }
            }
        }
        return result;
    }


}
