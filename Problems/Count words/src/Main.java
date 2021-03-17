import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine().trim();
        reader.close();
        String[] arr = input.split("\\s+");
        if (input.isEmpty() || input.isBlank()) {
            System.out.println(0);
        } else {
            System.out.println(arr.length);
        }
    }
}