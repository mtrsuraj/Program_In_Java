public class MaxNumber {
    public static void main(String[] args) {
        int[] arr = { 34, 56, 54, 43, 23, 55, 25, 59, 55 };
        int maxValue = maxFactory(arr);
        System.out.println("max value: " + maxValue);
    }

    public static int maxFactory(int[] arr) {
        int checkVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > checkVal) {
                checkVal = arr[i];
            }
        }
        return checkVal;
    }
}
