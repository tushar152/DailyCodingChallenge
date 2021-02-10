class Solution
{
    public static String reduced_String(int k, String s)
    {
        String regex="([a-z])"+"\\1"+"{"+(k-1)+"}";
        for(int i=1;i<s.length()/2;i++){
            if(s.length()==(s=s.replaceAll(regex,"")).length()){
                break;
            }
        }
        return s;
    }
}
