class Solution {
    
    public String reverse(String str){
        String ans="";
        Stack<Character> s = new Stack<>();
        for (int i=0; i<str.length(); i++)
        {
            s.push(str.charAt(i));
        }
        
        while(!s.isEmpty()){
            ans+=s.pop();
        }
        return ans;
    }

}
