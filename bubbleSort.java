public class bubbleSort {
    public static int[] bubbleSortAlg(int[] array) {
        for (int outerIter = 0; outerIter < array.length - 1; outerIter++) {
            for (int innerIter = 0; innerIter < array.length - (outerIter + 1); innerIter++) {
                if (array[innerIter] > array[innerIter + 1]) {
                    int temp = array[innerIter];
                    array[innerIter] = array[innerIter + 1];
                    array[innerIter + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = { 15, 6, 6, 8, 5 };
        bubbleSortAlg(array);
        for (int iter = 0; iter < array.length; iter++) {
            System.out.println(array[iter]);
        }
    }
}
