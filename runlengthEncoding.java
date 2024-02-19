public class runlengthEncoding {
    public static String runLengthEncoding(String string) {
        String output = "";
        int counter = 0;
        char[] chArray = string.toCharArray();
        for (int iter = 0; iter < chArray.length; iter++) {
            counter = counter + 1;
            if (iter + 1 < chArray.length && chArray[iter] == chArray[iter + 1]) {
                if (counter == 9) {
                    String condensedChar = Integer.toString(counter) + chArray[iter];
                    output = (new StringBuilder()).append(output).append(condensedChar).toString();
                    counter = 0;
                    continue;
                }
            } else if (counter > 1) {
                String condensedChar = Integer.toString(counter) + chArray[iter];
                output = (new StringBuilder()).append(output).append(condensedChar).toString();
                counter = 0;
            } else {
                String condensedChar = Integer.toString(counter) + chArray[iter];
                output = (new StringBuilder()).append(output).append(condensedChar).toString();
                counter = 0;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(runLengthEncoding("=========AAAA   AAABBBB   BBB"));
    }
}
