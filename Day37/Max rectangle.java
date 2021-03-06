class GfG {
    public int maxArea(int a[][], int m, int n) {
        ArrayList<Integer> aa = new ArrayList<Integer>();
        int i = 1;
        while (i < m) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 1)
                    a[i][j] += a[i - 1][j];
                else
                    a[i][j] = 0;
            }
            i++;
        }
        i = 0;
        while (i < m) {
            int z = area(a, n, i);
            aa.add(z);
            i++;
        }
        int s = 0;
        for (i = 0; i < aa.size(); i++) {
            if (s < aa.get(i)) s = aa.get(i);
        }
        return s;
    }
    public int area(int row[][], int C, int j) {
        Stack<Integer> result = new Stack<Integer>();
        int top_val;
        int max_area = 0;
        int area = 0;
        int i = 0;
        while (i < C) {
            if (result.empty() || row[j][result.peek()] <= row[j][i])
                result.push(i++);

            else {
                top_val = row[j][result.peek()];
                result.pop();
                area = top_val * i;
                if (!result.empty()) area = top_val * (i - result.peek() - 1);
                max_area = Math.max(area, max_area);
            }
        }
        while (!result.empty()) {
            top_val = row[j][result.peek()];
            result.pop();
            area = top_val * i;
            if (!result.empty()) area = top_val * (i - result.peek() - 1);
            max_area = Math.max(area, max_area);
        }
        return max_area;
    }
}
