
import java.util.*;

public class waitingTime {
    public static int minimumWaitingTime(int[] queries) {
        Arrays.sort(queries);
        return minimumWaitingTimeR(queries, 0, 0);
    }

    public static int minimumWaitingTimeR(int[] queries, int res, int sum) {

        if (queries.length > 0) {
            return sum + minimumWaitingTimeR(Arrays.copyOfRange(queries, 1, queries.length), queries[0], sum + res);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] input = { 3, 2, 1, 2, 6 };
        System.out.println(minimumWaitingTime(input));
    }
}