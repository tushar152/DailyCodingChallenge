class Solution
{
    public int Maximum_Sum(int mat[][],int N,int K){
    
        int maxsum = 0;
        for(int i = 0 ; i < (N-K+1); i++){
            for(int j = 0; j < (N-K+1); j++){
                int sum = 0;
                for(int k = i; k < (K+i); k++){
                    for(int p = j; p < (K + j); p++){
                        sum = sum + mat[k][p];
                    }
                }
                if(maxsum <= sum)
                    maxsum = sum;
            }
        }
        return maxsum;
    }
}
