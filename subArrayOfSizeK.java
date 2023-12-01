import javax.sound.midi.SysexMessage;

public class subArrayOfSizeK {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        for (int iter = 0; iter < k; iter++) {
            sum = sum + nums[iter];
        }
        for (int iter = k; iter < nums.length; iter++) {
            long tempSum = sum + nums[iter] - nums[iter - k];
            if (tempSum > sum) {
                sum = tempSum;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        subArrayOfSizeK s = new subArrayOfSizeK();
        int[] array = { 100, 200, 300, 2 };
        System.out.println(s.maximumSubarraySum(array, 2));
    }
}
