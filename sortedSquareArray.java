import java.util.Arrays;
// import java.util.function.Function;
// import java.util.stream.Stream;

public class sortedSquareArray {
    public int[] sortedSquaredArrayF(int[] array) {
        return Arrays.stream(array).map(x -> x * x).toArray();
    }

    public static void main(String[] args) {
        sortedSquareArray ss = new sortedSquareArray();
        int[] array = { -2, -1 };
        System.out.println(ss.sortedSquaredArrayF(array));
    }
}
