public class selectionSort {
    public static int[] selectionSortAlg(int[] array) {
        for (int outer = 0; outer < array.length; outer++) {
            int smallest = outer;
            for (int iter = outer + 1; iter < array.length; iter++) {
                if (array[iter] < array[smallest]) {
                    smallest = iter;

                }
            }
            if (smallest != outer) {
                int temp = array[smallest];
                array[smallest] = array[outer];
                array[outer] = temp;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = { 1, 23, 1, 16, 15, 19, 89, 76, 45 };
        System.out.println(selectionSortAlg(array));
        System.out.println("complete");
    }
}
