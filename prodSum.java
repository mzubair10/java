import java.util.*;

public class prodSum {
    public static int productSum(List<Object> array) {
        return productSumR(array, 1);
    }

    @SuppressWarnings("unchecked")
    public static int productSumR(List<Object> array, int depth) {
        int sum = 0;
        for (Object element : array) {
            sum += element instanceof ArrayList ? productSumR((ArrayList<Object>) element, depth + 1) : (int) element;
        }
        return sum * depth;
    }

    public static int productSumRecursive(List<Object> array, int counter) {
        int sum = 0;
        for (Object o : array) {
            sum += (o instanceof ArrayList ? productSumRecursive((ArrayList<Object>) o, counter + 1) : (int) o);
        }
        return sum * counter;
    }

    public static void main(String[] args) {
        List<Object> values = new ArrayList<Object>();
        values.add(5);
        values.add(2);
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(7);
        a.add(-1);
        values.add(a);
        values.add(3);
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(6);
        values.add(a1);
        ArrayList<Integer> a11 = new ArrayList<Integer>();
        a11.add(-13);
        a11.add(8);
        a1.add(4);
        values.add(a1);
        values.add(a11);
        System.out.println(productSum(values));
    }

}
