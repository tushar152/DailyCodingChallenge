// Two pointer approach for O(n) solution.

class Solution {
    int minDist(int a[], int n, int x, int y) {
        int recent_x = -1;
        int recent_y = -1;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                recent_x = i;
                
                if (recent_y != -1)
                    ans = Math.min(Math.abs(recent_x - recent_y), ans);
            } else if (a[i] == y) {
                recent_y = i;

                if (recent_x != -1)
                    ans = Math.min(Math.abs(recent_x - recent_y), ans);
            }
        }
        if (ans == Integer.MAX_VALUE) return -1;
        return ans;
    }
}
