class Solution {
    long findNth(long N)
    {
        //code here
        long result = 0, i = 1;
        while(N != 0)
        {
            result += i * (N % 9);
            N /= 9;
            i *= 10;
        }
        return result;
    }
}