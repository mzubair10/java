import javax.swing.text.StyleContext.SmallAttributeSet;

public class selectionSort {
    public static int[] selectionSortAlg(int[] array) {
        for (int outer = 0; outer < array.length; outer++) {
            int smallest = outer;
            for (int iter = outer + 1; iter < array.length; iter++) {
                if (array[iter] < array[smallest]) {
                    int temp = array[smallest];
                    array[smallest] = array[iter];
                    array[iter] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = { 12, 8, 9, 5, 54, 23 };
        System.out.println(selectionSortAlg(array));
    }
}
