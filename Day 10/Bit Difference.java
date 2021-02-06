class Solution
{
    public static long sumBitDiff(int arr[], int n) 
    { 
        // Your code goes here
        
        long res = 0;
        for(int i = 0; i < 32; i++){
            long count = 0;
            int mask = 1 << i;
            for(int j = 0; j < n; j++){
                if((arr[j] & mask) == 0)
                    count++;
            }
            res += (count * (n - count) * 2);
        }
        return res;
    }
}
