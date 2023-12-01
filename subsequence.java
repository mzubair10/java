import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsequence {
    public static boolean isValidSubsequence(
            List<Integer> array, List<Integer> sequence) {
        int subsequencePtr = 0;
        List<Integer> finalResultL = new ArrayList<>();
        for (int iter = 0; iter < array.size(); iter++) {
            if (subsequencePtr < sequence.size() && array.get(iter) == sequence.get(subsequencePtr)) {
                finalResultL.add(sequence.get(subsequencePtr));
                subsequencePtr++;
            }
        }
        return finalResultL.equals(sequence);
    }

    public static boolean isValidSubsequenceF(
            List<Integer> array, List<Integer> sequence) {
        int index = 0;
        for (int iter = 0; iter < array.size(); iter++) {
            if (array.get(iter) == sequence.get(index)) {
                index++;
            }
            if (index == sequence.size()) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // int[] array = { 5, 1, 22, 25, 6, -1, 8, 10 };
        // int[] sequence = { 1, 6, -1, 10 };
        System.out.println(
                isValidSubsequenceF(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10),
                        Arrays.asList(22, 2, 25, 6)));
    }
}
