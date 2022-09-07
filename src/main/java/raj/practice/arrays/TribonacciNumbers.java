package raj.practice.arrays;

class TribonacciNumbers {
    
    private int fixSum(int n) {
        int[] tribNumbs = new int[n];
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        tribNumbs[0] = 0;
        tribNumbs[1] = 1;
        tribNumbs[2] = 1;
        
        for (int i = 3; i < n;i++) {
            tribNumbs[i] = tribNumbs[i-1] + tribNumbs[i-2] + tribNumbs[i - 3];
        }
        
        return tribNumbs[n - 1] + tribNumbs[n - 2] + tribNumbs[n - 3];
    }
    
    public int tribonacci(int n) {
        
        return fixSum(n);
    }
}
