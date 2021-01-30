class Solution
{
   
	public int findK(int a[][], int n, int m, int k)
	{
	    // Your code goes here 
        int i, c = 0, l = 0;  
        int count = 0;
      
        while (c < n && l < m) {  
            
            for (i = l; i < m; ++i) {  
                count++;  
      
                if (count == k)  
                    return (a[c][i]); 
            }  
            c++;  
            
            for (i = c; i < n; ++i) {  
                count++;  
      
                if (count == k)  
                    return (a[i][m - 1]); 
            }  
            m--;  
            
            if (c < n) {  
                for (i = m - 1; i >= l; --i) {  
                    count++;  
      
                    if (count == k)  
                          
                    return (a[n - 1][i]); 
                }  
                n--;  
            }  
            
            if (l < m) {  
                for (i = n - 1; i >= c; --i) {  
                    count++;  
      
                    if (count == k)  
                        return (a[i][l]);  
                }  
                l++;  
            }  
        }
        return 0;
    }
}
