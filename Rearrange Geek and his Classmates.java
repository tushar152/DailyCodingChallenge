class Solution 
{ 
    void prank(long[] a, int n)  
    { 
         code here
        for(int i = 0;i  n; i++)
            a[i] = a[i] + (a[(int)a[i]]%n)n;
        
        for(int i = 0; i  n; i++)
            a[i] = a[i]  n;
    }
}