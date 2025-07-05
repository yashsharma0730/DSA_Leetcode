class Solution {
    public long maxSpending(int[][] values) {
        long max = 0;
        int m = values.length, n = values[0].length;
        int[] rightMost = new int[m];
        Arrays.fill(rightMost, n - 1);
        for (int day = 1; day <= m * n; day++) {
            int idxOfMin = -1, minPrice = Integer.MAX_VALUE;
            for (int i = 0; i < m; i++) {
                if (rightMost[i] < 0)
                    continue;
                if (minPrice > values[i][rightMost[i]]) {
                    minPrice = values[i][rightMost[i]];
                    idxOfMin = i;
                }
            }
            max += (long) day * minPrice;
            rightMost[idxOfMin]--;
        }
        return max;
    }
}