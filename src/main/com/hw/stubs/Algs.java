public class Algs {

    /**
     *  Accepts array of integers and
     *  iterates through for corresponding closest to zero negative integer number 
     *
     *  @param array of integer numbers
     *  @return negative number closest to 0
     */    
    private static int getMaxNeg(int[] arr) {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0 & res < arr[i]) {
                res = arr[i];
            }
        }
        return res;
    }
}