import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final double input = scanner.nextDouble();
        if (input > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}