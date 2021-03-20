class Solution
{
    int countSubstr (String s)
    {
        int cnt = 0;
        for (int i = 0; i < s.length (); ++i)
        {
            if (s.charAt (i) == '1')
                cnt++;
        }
    
        if (cnt <= 1)
            return 0;
        return ((cnt) * (cnt - 1)) / 2;
    }
}
