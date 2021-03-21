import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pbc = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        System.out.println(party(pbc, isWeekend));

    }

    static boolean party(int pbc, boolean isWeekend) {
        if (pbc >= 10 && pbc <= 20 && !isWeekend) {
            return true;
        } else if (pbc >= 15 && pbc <= 25 && isWeekend) {
            return true;
        }
        return false;
    }
}