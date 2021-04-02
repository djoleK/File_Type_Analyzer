import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String newStr = "";
        int noOfSubstrings = 1;
        int index = 0;
        int[] prefix;

        while (index < str.length()) {
            int len = newStr.length();
            newStr = str.charAt(index) + newStr;
            prefix = prefixFunction(newStr);
            noOfSubstrings += (len + 1) - Arrays.stream(prefix).max().getAsInt();
            index++;
        }
        System.out.println(noOfSubstrings);
    }

    public static int[] prefixFunction(String str) {
        int[] prefixFunc = new int[str.length()];
        for (int i = 1; i < str.length(); i++) {
            int j = prefixFunc[i - 1];
            while (j > 0 && str.charAt(i) != str.charAt(j)) {
                j = prefixFunc[j - 1];
            }
            if (str.charAt(i) == str.charAt(j)) {
                j += 1;
            }
            prefixFunc[i] = j;
        }
        return prefixFunc;
    }
}