public class longestPalindrome {
    public String longestPalindromeP(String s) {
        String[] splitString = s.split("");
        String longestSequence = splitString[0];
        for (int iter = 0; iter < splitString.length; iter++) {
            int lastPtr = splitString.length - 1, tempLastPtr = splitString.length - 1, firstPtr = iter;
            if (s.length() == 1)
                return s;
            while (firstPtr < lastPtr) {
                if (splitString[firstPtr].equals(splitString[lastPtr])) {
                    firstPtr++;
                    lastPtr--;
                    if (firstPtr >= lastPtr) {
                        String tempLongestSequence = (new StringBuilder()).append(s.substring(iter, tempLastPtr + 1))
                                .toString();
                        if (tempLongestSequence.length() > longestSequence.length()) {
                            longestSequence = tempLongestSequence;
                        }
                    }
                } else {
                    lastPtr = tempLastPtr;
                    tempLastPtr--;
                    lastPtr--;
                    firstPtr = iter;
                }
            }
        }
        return longestSequence;
    }

    public static void main(String[] args) {
        longestPalindrome l = new longestPalindrome();
        System.out.print(l.longestPalindromeP("madamx")); // aca
    }
}
