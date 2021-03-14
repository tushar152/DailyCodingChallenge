class Solution{
	public int countConfigurations(String S){
	    S += S.charAt(0); 
           
        int n = S.length();
        long total = 0;
        int mod = 1000000007;
        for (int k = 0; k < 2; k++) {
                
            long dp[][] = new long[n][2];
            for(int i=0;i<n;i++)
            Arrays.fill(dp[i],0);
            dp[0][k] = 1;
            for (int i = 1; i < n; i++) {
                if (S.charAt(i) == 'R') {
                    if (S.charAt(i - 1) == 'L') {
                        dp[i][0] = dp[i - 1][1];
                    }
                } else {
                    dp[i][0] = dp[i - 1][0];
                }

                if (S.charAt(i - 1) == 'L') {
                    dp[i][1] = dp[i - 1][0];
                } else {
                    dp[i][1] =(dp[i - 1][1] + dp[i - 1][0])%mod ;
                }

            }
            total = (total + dp[n - 1][k]) % mod;
        }
        
        return (int) total;
	}
}
