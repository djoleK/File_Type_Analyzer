import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String inputDate = scanner.nextLine();
        System.out.println(convert(inputDate));
    }

    static String convert(String inputDate) {
        String[] inputDates = inputDate.split("-");
        String[] inputDates2 = new String[inputDates.length];
        inputDates2[0] = inputDates[1];
        inputDates2[1] = inputDates[2];
        inputDates2[2] = inputDates[0];
        return String.join("/", inputDates2);
    }
}