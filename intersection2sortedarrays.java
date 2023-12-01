import java.util.*;

public class intersection2sortedarrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> listOfFinalCollection = new ArrayList<Integer>();
        Hashtable<Integer, Integer> hTable = new Hashtable<Integer, Integer>();
        for (int iter = 0; iter <= nums1.length - 1; iter++) {
            hTable.put(nums1[iter], iter);
        }
        for (int iter = 0; iter <= nums2.length - 1; iter++) {
            if (hTable.get(nums2[iter]) != null) {
                listOfFinalCollection.add(nums2[iter]);
            }
        }
        return java.util.stream.IntStream.of(listOfFinalCollection.stream().mapToInt(i -> i).toArray()).distinct()
                .toArray();
    }

    public static void main(String[] args) {
        intersection2sortedarrays ia = new intersection2sortedarrays();
        int[] arr1 = { 4, 9, 5 }, arr2 = { 9, 4, 9, 8, 4 };
        int[] resultCollection = ia.intersection(arr1, arr2);
        for (int iter = 0; iter < resultCollection.length; iter++) {
            System.out.println(resultCollection[iter]);
        }
    }
}
