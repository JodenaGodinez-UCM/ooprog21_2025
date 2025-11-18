import java.util.*;

public class Average {
    public static int countGreaterThanPreviousAverage(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        long total = arr[0];  
        int count = 0;

        for (int i = 1; i < arr.length; i++) {
            double avg = (double) total / i;
            if (arr[i] > avg) {
                count++;
            }
            total += arr[i];
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers separated by spaces:");
        String input = scanner.nextLine();

        String[] parts = input.trim().split("\\s+");
        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        int result = countGreaterThanPreviousAverage(arr);
        System.out.println("Output: " + result);
    }
}
