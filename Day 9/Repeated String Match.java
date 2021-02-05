class Solution
{
    static int repeatedStringMatch(String A, String B)
    {
        if(A.indexOf(B) != -1)
            return -1;
        
        StringBuilder s1 = new StringBuilder("");
        StringBuilder s2 = new StringBuilder("");
        
        int length = B.length() + A.length();
        int repeated = 0;
        
        while((s1.indexOf(B) == -1) && (s1.length() < length)){
            s1.append(A);
            repeated++;
        }
        
        if(s1.indexOf(B) == -1)
            return -1;
            
        return repeated;
    }
}
