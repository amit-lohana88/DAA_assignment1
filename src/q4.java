public class q4 {

    public static void main(String[] args) {

        // String 1 = Your complete name
        String str1 = "AMIT KUMAR".replace(" ", "").toUpperCase();

        // Given String 2
        String str2 = "ETAOINSHR";

        int m = str1.length();
        int n = str2.length();

        int[][] dp = new int[m + 1][n + 1];

        // Build DP table
        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= n; j++) {

                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {

                    dp[i][j] = dp[i - 1][j - 1] + 1;

                } else {

                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Find LCS string
        int i = m;
        int j = n;

        String lcs = "";

        while (i > 0 && j > 0) {

            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {

                lcs = str1.charAt(i - 1) + lcs;
                i--;
                j--;

            } else if (dp[i - 1][j] > dp[i][j - 1]) {

                i--;

            } else {

                j--;
            }
        }

        // Output
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        System.out.println("\nLongest Common Subsequence: " + lcs);

        System.out.println("Length of LCS: " + lcs.length());
    }
}