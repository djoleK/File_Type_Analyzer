import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final double a = scanner.nextDouble();
        final double b = scanner.nextDouble();
        final double c = scanner.nextDouble();

        double root1, root2;
        final double determinant = b * b - 4 * a * c;


        root1 = (-b + Math.sqrt(determinant)) / (2 * a);
        root2 = (-b - Math.sqrt(determinant)) / (2 * a);

        double smallerRoot, largerRoot;
        if (root1 > root2) {
            smallerRoot = root2;
            largerRoot = root1;
        } else {
            smallerRoot = root1;
            largerRoot = root2;
        }

        System.out.print(smallerRoot);
        System.out.print(" ");
        System.out.print(largerRoot);
    }
}