public class MaxValMethod {
    public static void main(String[] args) {
        int[] arr = { 34, 65, 23, 54, 21, 2, 123 };
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) { // for min arr[i]<min
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}