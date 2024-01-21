
import java.util.Arrays;
import java.util.stream.IntStream;

public class threelargestnumbers {
    public static int[] findThreeLargestNumbers(int[] array) {
        int[] coll = new int[3];
        coll[0] = array[0];
        coll[1] = array[1];
        coll[2] = array[2];
        Arrays.sort(coll);
        for (int iter = 3; iter < array.length; iter++) {
            if (array[iter] >= coll[2]) {
                coll[0] = coll[1];
                coll[1] = coll[2];
                coll[2] = array[iter];
            } else if (array[iter] > coll[0] && array[iter] < coll[1]) {
                coll[0] = array[iter];
            } else if (array[iter] > coll[1] && array[iter] < coll[2]) {
                coll[0] = coll[1];
                coll[1] = array[iter];
            }
        }
        for (int iter = 0; iter < coll.length; iter++) {
            System.out.println(coll[iter]);
        }
        return coll;
    }

    public static void main(String[] args) {
        // int[] myIntArray = new int[3];
        int[] array = IntStream.of(141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7).toArray();
        System.out.println(findThreeLargestNumbers(array));
    }
}
