package raj.practice.arrays;

class LongestPalindrome {
    
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] table = new boolean[n][n];
        int maxLength = 1;
        for (int i = 0;i < n;i++) {
            table[i][i] = true;
        }
        int start = 0;
        for (int i = 0;i < n - 1;i++) {
            if(s.charAt(i) == s.charAt(i + 1)) {
                table[i][i+1] = true;
                start = i;
                maxLength = 2;
            }
        }
        for (int j = 3;j <=n;++j) {
            for (int i = 0;i < n - j + 1;i++) {
                int k = i + j - 1;
                if(table[i + 1][k - 1] && s.charAt(i) == s.charAt(k)) {
                    table[i][k] = true;
                    if (j > maxLength) {
                        maxLength = j;
                        start = i;
                    }
                }
            }
            
        }
        return s.substring(start, start+maxLength);
        
    }
}
