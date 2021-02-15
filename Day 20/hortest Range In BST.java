class Solution {
    public Range shortestRange(Node root) {
        ArrayList<Integer> inOrder = new ArrayList<Integer>();
        ArrayList<Integer> level = new ArrayList<Integer>();
        storeInOrder(root, 0, inOrder, level);
        int i = 0, j = 0, k = 0, cntZero = 0,
            maxDepth = Collections.max(level) + 1;
        int[] depth = new int[maxDepth];
        for (k = 0; k < level.size(); k++) {
            depth[level.get(k)]++;
            if (level.get(k) == 0) {
                j = k;
                break;
            }
        }
        for (int u : depth) {
            if (u == 0) {
                cntZero++;
            }
        }
         int x = inOrder.get(0), y = inOrder.get(inOrder.size() - 1);
        if (cntZero == 0) {
            x = inOrder.get(i);
            y = inOrder.get(j);
        }
        while (i <= k && j < inOrder.size()) {
            while (j < inOrder.size()) {
                if (cntZero == 0) {
                    if ((y - x) > (inOrder.get(j) - inOrder.get(i))) {
                        x = inOrder.get(i);
                        y = inOrder.get(j);
                    }
                    break;
                }
                j++;
                if (j >= inOrder.size()) {
                    break;
                }
                if (depth[level.get(j)] == 0) {
                    cntZero--;
                }
                depth[level.get(j)]++;
            }
            while (cntZero == 0 && i <= k) {
                if ((y - x) > (inOrder.get(j) - inOrder.get(i))) {
                    x = inOrder.get(i);
                    y = inOrder.get(j);
                }
                depth[level.get(i)]--;
                if (depth[level.get(i)] == 0) {
                    cntZero++;
                }
                i++;
            }
        }
        return new Range(x, y);
    }
    public void storeInOrder(Node root, int depth, ArrayList<Integer> inOrder,
                      ArrayList<Integer> level) {
        if (root == null) return;
        storeInOrder(root.left, depth + 1, inOrder, level);
        inOrder.add(root.data);
        level.add(depth);
        storeInOrder(root.right, depth + 1, inOrder, level);
    }
}
