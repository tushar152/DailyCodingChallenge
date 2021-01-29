class Solution {
    public int find_min(int[] a, int n, int k) {
        // code here.
        
        int sum = 0;
        int pairs = 0;
        for(int i = 0; i < n; i++)
        {
            pairs += a[i] / 2;
            if(a[i] % 2 == 0)
                sum += (a[i] - 2) / 2;
            else
                sum += (a[i] - 1) / 2;
        }
        if(k > pairs) return - 1;
        if(k <= sum) return 2 * (k - 1) + n + 1;
        return 2 * sum + n + (k - sum);
    }
}
