
import java.util.Arrays;

class Çözüm {
    public int ParaÜstü(int[] paralar, int miktar) {
        int m = paralar.length, n = miktar;
        int dp[][] = new int[m + 1][n + 1];
        for (int j = 0; j <= n; j++) {
            dp[0][j] = 0;
        }
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 0;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                int t1 = Integer.MAX_VALUE;
                if ((i - 1) == 0) {
                    if (j % paralar[i - 1] == 0) {
                        dp[i][j] = j / paralar[i - 1];
                    } else {
                        dp[i][j] = -1;
                    }
                } else {
                    int t2 = dp[i - 1][j];
                    if (paralar[i - 1] <= j) {
                        t1 = dp[i][j - paralar[i - 1]] + 1;
                    }
                    dp[i][j] = Math.min(t1, t2);
                }
            }
        }
        if (dp[m][n] == -1)
            return -1;
        else
            return dp[m][n];
    }

    int[][] dp;

    public int KHesapla(int miktar, int[] paralar) {

        int n = paralar.length;
        int[][] dp = new int[n][miktar + 1];

        for (int i = 0; i <= miktar; i++)
            if (i % paralar[0] == 0)
                dp[0][i] = 1;

        for (int i = 1; i < n; i++) {
            for (int toplam = 0; toplam <= miktar; toplam++) {

                int seç = 0;

                if (paralar[i] <= toplam) {
                    seç = dp[i][toplam - paralar[i]];
                }

                int seçme = dp[i - 1][toplam];

                dp[i][toplam] = seç + seçme;

            }
        }

        return dp[n - 1][miktar];
    }
}




