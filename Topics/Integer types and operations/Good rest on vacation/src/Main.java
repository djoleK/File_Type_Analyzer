import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int days = scanner.nextInt();
        final int foodCost = scanner.nextInt();
        final int oneWayFlightCost = scanner.nextInt();
        final int hotelNightCost = scanner.nextInt();
        printResult(days, foodCost, oneWayFlightCost, hotelNightCost);
    }

    static void printResult(int days, int foodCost, int oneWayFlightCost, int hotelNightCost) {
        int result = days * foodCost + 2 * oneWayFlightCost + (days - 1) * hotelNightCost;
        System.out.println(result);
    }
}