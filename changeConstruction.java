import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class changeConstruction {
    public static int nonConstructibleChangeF(int[] coins) {
        int minChange = 0;
        Arrays.sort(coins);
        if (coins.length == 0)
            return 1;
        for (int i = 0; i < coins.length; i++) {
            if (minChange + 1 < coins[i]) {
                break;
            }
            minChange += coins[i];
        }
        return minChange + 1;
    }

    public static int nonConstructibleChange(int[] coins) {
        if (coins.length == 0 || (coins.length == 1 && coins[0] > 1))
            return 1;
        Arrays.sort(coins);
        List<Integer> coinsPermutation = new ArrayList<Integer>();
        for (int iter = 0; iter < coins.length; iter++) {
            if (iter == 0) {
                coinsPermutation.add(coins[iter]);
                continue;
            }
            int incomingValue = coins[iter];
            int lastElement = coinsPermutation.get(coinsPermutation.size() - 1);
            if (lastElement + 1 < coins[iter]) {
                return lastElement + 1;
            }
            List<Integer> modCoinsPermutation = coinsPermutation.stream().map(x -> x + incomingValue).toList();
            coinsPermutation = Stream.concat(coinsPermutation.stream(), modCoinsPermutation.stream())
                    .collect(Collectors.toList());
        }
        return coinsPermutation.get(coinsPermutation.size() - 1) + 1;
    }

    public static void main(String[] args) {
        int[] coins = { 1 };
        System.out.println(nonConstructibleChangeF(coins));
    }
}
