import java.util.*;

public class binarySearch {
    public static int binarySearchP(int[] array, int target) {
        return binarySearchR(array, target, 0, array.length - 1);
    }

    public static int binarySearchQ(int[] array, int target) {
        if (array == null)
            return -1;
        int left = 0, right = array.length - 1, middle;
        while (left <= right) {
            middle = (left + right) / 2;
            if (array[middle] > target) {
                right = middle - 1;
            } else if (array[middle] < target) {
                left = middle + 1;
            } else if (array[middle] == target) {
                return middle;
            }
        }
        return -1;
    }

    public static int binarySearchR(int[] array, int target, int left, int right) {
        int midPoint = (left + right) / 2;
        if (array[midPoint] == target) {
            return midPoint;
        }

        if (array[midPoint] > target) {
            right = midPoint;
        } else {
            left = midPoint;
        }
        if (left + 1 < right) {
            return binarySearchR(array, target, left, right);
        } else if (array[left] == target) {
            return left;
        } else if (array[right] == target) {
            return right;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] input = { 1, 5, 23, 111 };
        System.out.println(binarySearchQ(input, 111));
    }
}
