
//import java.util.*;;

public class transposeMatrix {
    public static int[][] transposeMatrixF(int[][] matrix) {
        int rowCnt = matrix.length;
        int colCnt = matrix[0].length;
        int[][] finalArray = new int[colCnt][rowCnt];
        int higherDimension = (rowCnt > colCnt ? rowCnt : colCnt);
        for (int iter = 0; iter < higherDimension; iter++) {
            int temp = iter;
            if (temp < rowCnt && temp < colCnt) {
                finalArray[iter][temp] = matrix[iter][temp];
            }
            while (temp < higherDimension) {
                temp++;
                if (temp < colCnt && iter < rowCnt) {
                    finalArray[temp][iter] = matrix[iter][temp];
                }
                if (temp < rowCnt && iter < colCnt) {
                    finalArray[iter][temp] = matrix[temp][iter];
                }
            }
        }
        return finalArray;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1 },
                { 2 },
                { 3 }
        };
        System.out.println(transposeMatrixF(matrix));
    }
}
