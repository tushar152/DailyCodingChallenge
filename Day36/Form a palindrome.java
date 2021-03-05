class Solution{
    static int min(int a, int b)
    {   return a < b ? a : b;  }
 
    static int findMinInsertions(String S)
    {
        int n= S.length();
        int table[][] = new int[n][n];
        int l, h, gap;
        
        for (gap = 1; gap < n; ++gap)
            for (l = 0, h = gap; h < n; ++l, ++h)
                table[l][h] = (S.charAt(l) == S.charAt(h))? table[l+1][h-1] :
                              (min(table[l][h-1], table[l+1][h]) + 1);
       return table[0][n-1];
    }
}
