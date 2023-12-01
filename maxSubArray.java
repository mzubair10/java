public class maxSubArray {
    public int maxSubArrayP(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int highestSum = nums[0], tempHighestSum = nums[0];
        for (int iter = 1; iter <= nums.length - 1; iter++) {
            if (tempHighestSum + nums[iter] < nums[iter]) {
                tempHighestSum = nums[iter];
            } else {
                tempHighestSum = tempHighestSum + nums[iter];
            }
            if (highestSum < tempHighestSum) {
                highestSum = tempHighestSum;
            }
        }
        return highestSum;
    }

    public static void main(String[] args) {
        maxSubArray m = new maxSubArray();
        int[] nums = { 5, 4, -1, 7, 8 };
        System.out.print(m.maxSubArrayP(nums));
    }
}
