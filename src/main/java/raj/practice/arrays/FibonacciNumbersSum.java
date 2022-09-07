package raj.practice.arrays;

FibonacciNumbersSum {
    public int fib(int n) {
        
        int numbers[] = new int[n];
       
        if (n == 0) {
            return 0;
        }
        
        if (n == 1) {
            return 1;
        }
        numbers[0] = 0;
        numbers[1] = 1;
        for (int i = 2 ; i < n;i++) {
            numbers[i] = numbers[i-1] + numbers[i-2];
        }
        return numbers[n-1] + numbers[n-2];
        
    }
}
