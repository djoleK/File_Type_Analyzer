import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int length = scanner.nextInt();
        final int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i : arr) {
            if (i % 6 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}