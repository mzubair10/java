import java.time.temporal.Temporal;

import javax.naming.InitialContext;

public class selectionSortNew {
    public static int[] selectionSort(int[] array) {
        for (int iter = 0; iter < array.length; iter++) {
            int lowest = iter;
            for (int innerIter = iter + 1; innerIter < array.length; innerIter++) {
                if (array[innerIter] < array[lowest]) {
                    lowest = innerIter;
                }
            }
            if (lowest != iter) {
                int temp = array[iter];
                array[iter] = array[lowest];
                array[lowest] = temp;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = { 8, 5, 2, 9, 5, 6, 3 };
        selectionSort(array);
        for (int iter = 0; iter < array.length; iter++) {
            System.out.println(array[iter]);
        }
    }
}
