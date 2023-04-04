public class KthNumberUsingForEach {
    public static void main(String[] args) {
        int[] arr = { 2, 34, 123, 543, 67, 1, 567, 23, 65 };
        int highestNumber = maxValueFinder(arr);
        System.out.println(highestNumber);
    }

    public static int maxValueFinder(int[] arr) {
        // int[] maxValue = arr;
        int firstNumber = arr[0];
        for (int i : arr) {
            if (i > firstNumber) {
                firstNumber = i;
            }
        }
        return firstNumber;
    }
}
