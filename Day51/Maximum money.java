class Solution {
    static int maximizeMoney(int N , int K) {
        
        int ans;
        
        if(N%2==1)
            ans = ((N/2)+1)*K;        // ans calculated when N is odd
        else
            ans = (N/2)*K;            // ans calculated when N is even
            
        return ans;
    }
};
