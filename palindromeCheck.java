public class palindromeCheck {
    public static boolean isPalindrome(String str) {
        char[] chArray = str.toCharArray();
        int midPoint = Math.ceilDiv(str.length(), 2);
        for (int iter = 0; iter < midPoint; iter++) {
            if (chArray[iter] == chArray[chArray.length - (iter + 1)]) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abcdcba"));
    }
}
