class Solution{
    static int candies(int m, int n)
    {
        int X = (m * n) - m - n;

        HashSet<Integer> hash_set = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(X);
        hash_set.add(X);

        int count = 0;
        while (!queue.isEmpty()) {

            int curr = queue.poll();
            count++;
            
            int key = curr-m;
            if (key > 0 && hash_set.contains(key)==false ) {
                queue.add(key);
                hash_set.add(key);
            }
            
            key = curr - n;
            if (key > 0 && hash_set.contains(key)==false) {
                queue.add(key);
                hash_set.add(key);
            }
        }

        return count;
    }
}
