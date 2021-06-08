package raj.practice.arrays;

import java.util.Arrays;
import java.util.List;

public class RotateLeft {

    /**
     * Rotates the given list to the left by the number of times that is passed in
     * @param a - List of integers
     * @param d - number of times to rotate the list
     * @return - List after rotating d times
     */
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        Integer[] resultArray = new Integer[a.size()];
        int offSet =  Math.abs(a.size() - d);
        for(int i = 0;i < a.size();i++) {
            int index = i + offSet;
            if (index >= a.size()) {
                index = Math.abs(a.size() - index);
            }
            resultArray[index] = a.get(i);
        }
        return Arrays.asList(resultArray);
    }

    public static void main(String[] args) {
        System.out.println(rotLeft(Arrays.asList(1, 2, 3, 4, 5), 2));
    }
}
