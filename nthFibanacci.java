import java.util.ArrayList;
import java.util.List;

public class nthFibanacci {
    public static int getNthFib(int n) {
        int zero = 0, first = 1;
        if (n == 1)
            return zero;
        for (int iter = 0; iter < n - 1; iter++) {
            System.out.println(zero);
            int temp = zero + first;
            zero = first;
            first = temp;
        }
        return zero;
    }

    public static int getNthFibRecursive(int n) {
        if (n <= 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        return getNthFibRecursive(n - 1) + getNthFibRecursive(n - 2);
    }

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + getNthFibRecursive(i);
        }
        System.out.println(getNthFibRecursive(4));
    }
}
