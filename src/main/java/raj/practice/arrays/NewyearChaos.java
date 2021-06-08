package raj.practice.arrays;

import java.util.Arrays;
import java.util.List;

public class NewyearChaos {

    /**
     * Routine to determine number of bribes in the rollercoaster queue for NewYear
     * @param q - Position of list of people wearing the ticket
     */
    public static void minimumBribes(List<Integer> q) {
        int maxNumberOfBribes = 2;
        int numberOfBribes = 0;
        for(int i = q.size() - 1;i >= 0;i--) {
            int diff = q.get(i) - (i + 1);
            if (diff > maxNumberOfBribes) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = Math.max(0, (q.get(i) - 2));j< i;j++) {
                if (q.get(j) > q.get(i)) {
                    numberOfBribes += 1;
                }
            }

        }
        System.out.println(numberOfBribes);
    }

    public static void main(String[] args) {
        minimumBribes(Arrays.asList(1, 2, 5, 3, 4, 7, 6));
    }

}
