import java.util.*;

public class TravellingSalesMan{
    static int N;
    static int[][] dist;
    static int[][] dp;
    static final int INF = 1_000_000_000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        dist = new int[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                dist[i][j] = sc.nextInt();

        int size = 1 << N;
        dp = new int[N][size];
        for (int[] row : dp) Arrays.fill(row, -1);

        System.out.println(tsp(0, 1));
        sc.close();
    }

    static int tsp(int pos, int mask) {
        if (mask == (1 << N) - 1)
            return dist[pos][0];

        if (dp[pos][mask] != -1)
            return dp[pos][mask];

        int ans = INF;
        for (int city = 0; city < N; city++) {
            if ((mask & (1 << city)) == 0) {
                ans = Math.min(ans, dist[pos][city] + tsp(city, mask | (1 << city)));
            }
        }
        return dp[pos][mask] = ans;
    }
}
