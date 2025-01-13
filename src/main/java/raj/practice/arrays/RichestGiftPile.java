package raj.practice.arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class RichestGiftPile {

    public long pickGifts(int[] gifts, int k) {
        if (gifts == null) {
            return 0;
        }
        PriorityQueue<Integer> intQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0;i < gifts.length;i++) {
            intQueue.add(gifts[i]);
        }
        for (int i = 0;i < k;i++) {
            int temp = (int) Math.sqrt(intQueue.poll());
            intQueue.add(temp);
        }
        long count = 0;
        for (int i = 0;i < intQueue.size();i++) {
            count += intQueue.poll();
        }
        return count;
    }
    
}
