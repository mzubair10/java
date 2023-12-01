import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class subArrayOfSizeKUnique {
    public long maximumSubarraySum(int[] nums, int k) {
        List<Integer> listOfFinalCollection = new ArrayList<Integer>();
        long sum = 0;
        for (int iter = 0; iter <= nums.length - 1; iter++) {
            long tempSum = 0;
            if (iter + k > nums.length) {
                break;
            }
            int range = (iter + k > nums.length ? nums.length : iter + k);
            Integer[] subarray = IntStream.range(iter, range)
                    .mapToObj(i -> nums[i])
                    .toArray(Integer[]::new);
            Set<Integer> allItems = new HashSet<>();
            Set<Integer> duplicates = Arrays.stream(subarray)
                    .filter(n -> !allItems.add(n))
                    .collect(Collectors.toSet());
            if (duplicates.size() > 0) {
                continue;
            }
            for (int innerIter = 0; innerIter < subarray.length; innerIter++) {
                tempSum += subarray[innerIter];
                sum = Math.max(sum, tempSum);
            }
            listOfFinalCollection.clear();
        }
        return sum;
    }

    public static void main(String[] args) {
        subArrayOfSizeKUnique s = new subArrayOfSizeKUnique();
        int[] array = { 4, 4, 4 };
        System.out.println(s.maximumSubarraySum(array, 3));
    }
}
