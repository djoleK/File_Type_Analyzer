import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String string = scanner.next();
            StringBuilder stringBuilder = new StringBuilder(string);
            String reversed = stringBuilder.reverse().toString();
            int output = Integer.valueOf(reversed);
            System.out.println(output);
        }
    }
}