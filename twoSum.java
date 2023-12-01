import javax.sound.midi.SysexMessage;

public class twoSum {
    public int[] result(int[] nums, int target) {
        int[] outputResult = new int[2];
        for (int iter = 0; iter < nums.length; iter++) {
            int firstPtr = iter, lastPtr = nums.length - 1;
            while (firstPtr < lastPtr) {
                if (nums[firstPtr] + nums[lastPtr] == target) {
                    outputResult[0] = firstPtr;
                    outputResult[1] = lastPtr;
                    return outputResult;
                } else {
                    lastPtr--;
                }
            }
        }
        return outputResult;
    }

    public static void main(String[] args) {
        twoSum two = new twoSum();
        int[] arr = { 2, 13, 3 };
        int[] resultN = two.result(arr, 6);
        for (int iter = 0; iter < resultN.length; iter++) {
            System.out.print(resultN[iter] + " ");
        }
    }
}