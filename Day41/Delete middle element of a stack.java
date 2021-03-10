class Solution
{
    public void deleteMid_util(Stack<Integer>s,int sizeOfStack,int current)
    {
        if(current==sizeOfStack/2)
        {
            s.pop();
            return;
        } 
        int x=s.peek();
        s.pop();
        current+=1;
        
        deleteMid_util(s,sizeOfStack,current);
        s.push(x);
    } 
    public void deleteMid(Stack<Integer>s,int sizeOfStack)
    {
        deleteMid_util(s,sizeOfStack,0);
    }
}
