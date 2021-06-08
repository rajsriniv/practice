package raj.practice.arrays;

public class MinimumSwaps {

    /**
     * Routine to find minimum number of swaps required to sort an array of distinct integer in asc order
     * @param arr - elemets to be sorted
     * @return - number of swaps required to sort the given array
     */
    static int minimumSwaps(int[] arr) {
        int count = 0;
        int i = 0, j = arr.length;
        while(i < j) {
            if (arr[i] != i+1) {
                count += 1;
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            } else {
                i++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(minimumSwaps(new int[]{7, 1, 3, 2, 4, 5, 6}));
    }
}
