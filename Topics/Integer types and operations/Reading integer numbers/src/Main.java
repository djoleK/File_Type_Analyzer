import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       final Scanner scanner = new Scanner(System.in);
       int input;
       while (scanner.hasNextInt()) {
           input = scanner.nextInt();
           System.out.println(input);
       }
    }
}