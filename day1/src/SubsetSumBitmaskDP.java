import java.util.Scanner;

public class SubsetSumBitmaskDP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 0;
        int totalSubsets = 1 << N; // 2^N subsets

        for (int mask = 0; mask < totalSubsets; mask++) {
            int sum = 0;

            for (int i = 0; i < N; i++) {
                if ((mask & (1 << i)) != 0) {
                    sum += arr[i];
                }
            }

            if (sum == K) {
                count++;
            }
        }

        System.out.println(count);

        scanner.close();
    }
}
