public class Algs {

    // get negative number closest to zero
    private static int getMaxNeg(int[] arr) {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0 & res<arr[i]) {
                res = arr[i];
            }
        }
        return res;
    }
}