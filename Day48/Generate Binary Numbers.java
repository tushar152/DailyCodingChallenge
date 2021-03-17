class solve{
    static ArrayList<String> generate(int N)
    {
        //Creating a new ArrayList
        ArrayList<String> res = new ArrayList<String>();
        
        //Creating a Queue
        Queue<String> q = new LinkedList<>();
        
        //adding 1 to the Queue
        q.add("1");
        
        //running a loop till n is greater than 0
        while(N-- > 0)
        {
            //adding the polled out string to the
            //ArrayList
            String s1 = q.peek();
            q.poll();
            res.add(s1);
            
            //making a new String s2 with a 
            //copy of s1 and concatenating '1'
            //and '0' to each copies and the adding 
            //the Strings to the Queue
            String s2 = s1;
            q.add(s1 + '0');
            q.add(s2 + '1');
        }
        return res ;
    }
    
}
