import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        StringBuilder sb = new StringBuilder(line);
        sb.reverse();
        System.out.println(sb.toString());
        reader.close();
    }
}