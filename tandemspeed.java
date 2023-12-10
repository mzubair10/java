import java.util.Arrays;

public class tandemspeed {
    public static int tandemBicycle(
            int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        // Write your code here.
        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);
        int sum = 0;
        if (fastest) {
            for (int iter = 0; iter < redShirtSpeeds.length; iter++) {
                sum = sum + Math.max(redShirtSpeeds[iter], blueShirtSpeeds[(blueShirtSpeeds.length - 1) - iter]);
            }
        } else {
            for (int iter = 0; iter < redShirtSpeeds.length; iter++) {
                sum = sum + Math.max(redShirtSpeeds[iter], blueShirtSpeeds[iter]);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] red = { 5, 5, 3, 9, 2 };
        int[] blue = { 3, 6, 7, 2, 1 };
        System.out.println(tandemBicycle(red, blue, false));
    }
}
