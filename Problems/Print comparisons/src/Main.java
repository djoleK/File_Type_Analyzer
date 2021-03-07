import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int size = new Scanner(System.in).nextInt();
        int[] nums = new int[size];
        IntStream.range(0, size)
                .forEach(i -> nums[i] = i);

        int[] comparisonCounts = runJumpSearch(nums);
        StringBuilder result = new StringBuilder();
        Arrays.stream(comparisonCounts).forEach(n -> result.append(n).append(" "));
        System.out.println(result.toString().stripTrailing());
    }

    private static int[] runJumpSearch(int[] nums) {
        int[] counts = new int[nums.length];
        int blockSize = (int) Math.sqrt(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int lookingFor = nums[i];
            int comparisonsDone = 0;
            int j = 0;
            while (j < nums.length) {
                comparisonsDone++;
                if (nums[j] == lookingFor) {
                    break;
                } else if (nums[j] < lookingFor) {
                    j += blockSize;
                    if (j >= nums.length) {
                        j = nums.length - 1;
                    }
                } else if (nums[j] > lookingFor) {
                    int limit = j - blockSize;
                    while (--j >= limit && nums[j] > lookingFor) {
                        comparisonsDone++;
                    }
                    if (nums[j] == lookingFor) {
                        comparisonsDone++;
                        break;
                    }
                }
            }
            counts[i] = comparisonsDone;
        }

        return counts;
    }
}