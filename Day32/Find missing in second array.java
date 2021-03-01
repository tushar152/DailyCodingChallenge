class Solution{
    
    ArrayList<Long>  findMissing(long a[], long b[],  int N, int M){ 
      
        Set<Long> s = new HashSet<Long>(); 
        ArrayList<Long> ans = new ArrayList<Long>();
      
        for (int i = 0; i < M; i++) 
            s.add(b[i]); 
      
        for (int i = 0; i < N; i++) 
            if (!s.contains(a[i])) 
                ans.add(a[i]);
        return ans;
    }
};
