class Solution 
{ 
    ArrayList<Integer> Util(int cur, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> temp;
        if(adj.get(cur).size() == 0){
            a.add(cur);
            return a;
        }
        for(int i = 0; i < adj.get(cur).size(); i++){
            temp = Util(adj.get(cur).get(i), adj);
            for(int j=0;j<temp.size();j++)
                a.add(temp.get(j));
        }
        int sz = (int)a.size();
        sz /= 2;
        a.add(sz, cur);
        return a;
    }
    ArrayList<Integer> labelTree(int N, int p[]) 
    { 
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<N;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        for(int i = 1; i < N; i++){
            adj.get(p[i]).add(i);
        }
        ArrayList<Integer> temp = Util(0, adj);
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i = 0; i < N; i++)
            res.add(0);
        for(int i = 0; i < N; i++){
            res.set(temp.get(i), i + 1);
        }
        return res;
    }
} 
