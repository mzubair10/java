import java.util.Arrays;

public class twoNumberSum {

    public static int[] twoNumberSumF(int[] array, int targetSum) {
        Arrays.sort(array);
        int leftPtr = 0, rightPtr = array.length - 1;
        while (leftPtr < rightPtr) {
            int sum = array[leftPtr] + array[rightPtr];
            if (sum == targetSum) {
                int[] arr = { array[leftPtr], array[rightPtr] };
                return arr;
            } else if (sum < targetSum) {
                leftPtr++;
            } else {
                rightPtr--;
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] array = { 3, 5, -4, 8, 11, 1, -1, 6 };
        System.out.println(twoNumberSumF(array, 10));
    }
}
