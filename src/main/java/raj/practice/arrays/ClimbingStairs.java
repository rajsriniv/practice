class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int[] sumArray = new int[n + 1];
        sumArray[0] = 0;
        sumArray[1] = 1;
        sumArray[2] = 2;
        int sum = 0;
        for (int i = 3;i<=n;i++) {
            sumArray[i] += sumArray[i - 1] + sumArray[i - 2];
        }
        return sumArray[n];
    }
}
