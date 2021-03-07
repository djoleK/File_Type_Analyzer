import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int blockSize = (int) Math.sqrt(arrSize);

        int[] nums = IntStream.range(0, arrSize)
                .map(i -> sc.nextInt()).toArray();
        int target = sc.nextInt();

        String result = null;
        for (int i = blockSize - 1; i < nums.length; i += blockSize) {
            if (nums[i] >= target) {
                result = i - blockSize + 1 + " " + i;
                break;
            }
        }
        if (result == null) {
            int lastElIdx = nums.length - 1;
            result = nums[lastElIdx] >= target
                    ? lastElIdx - lastElIdx % blockSize + " " + lastElIdx
                    : "-1";
        }

        System.out.println(result);
    }
}
