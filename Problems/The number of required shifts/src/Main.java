import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int length = scanner.nextInt();
        final int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(numShifts(arr));
    }

    public static int numShifts(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            int elem = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] < elem) {
                arr[j + 1] = arr[j];
                --j;
            }
            if (j != i - 1) {
                ++count;
            }
            arr[j + 1] = elem;
        }
        return count;
    }
}