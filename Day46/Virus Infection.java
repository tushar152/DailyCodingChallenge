class Pair{
    public int first,second;
    Pair(int x,int y)
    {
        first=x;
        second=y;
    }
}
class Solution 
{ 
    int virusInfection(String s, int K) 
    { 
        int n = s.length();
        boolean vis[] = new boolean[n+1];
        Arrays.fill(vis,false);
        Deque<Pair> q = new LinkedList<Pair>(); 
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '1'){
                q.addLast(new Pair(i, 0));
                vis[i] = true;
                ans++;
            }
        }
        while(q.size()>0){
            Pair f = q.getFirst();
            q.removeFirst();
            if(f.second < K){
                if(f.first - 1 >= 0){
                    if(vis[f.first - 1] == false){
                        q.addLast(new Pair(f.first - 1, f.second + 1));
                        vis[f.first - 1] = true;
                        ans++;
                    }
                }
                if(f.first + 1 < n){
                    if(vis[f.first + 1] == false){
                        q.addLast(new Pair(f.first + 1, f.second + 1));
                        vis[f.first + 1] = true;
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
} 
