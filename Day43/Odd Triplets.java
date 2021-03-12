class Solution 
{ 
    long countTriplet(int N, int A[],int X) 
    { 
        long ans=0,p=0,q=0;
        for(int k=X;k<N;k++)
        {
            if(A[k]%2==1)
                q++;
        }

        for(int j=0;j<N;j++)
        {

            if(j-X>=0&&A[j-X]%2==1)
                p++;
            
            if(A[j]%2==1)
            ans+=p*q;

            if(j+X<N&&A[j+X]%2==1)
                q--;
        }
        return ans;
    }
} 
