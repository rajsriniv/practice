package raj.practice.queue.config;

import java.util.Comparator;

public class DataComparator implements Comparator<Data> {

    @Override
    public int compare(Data o1, Data o2) {
        if (o1.getCount() == o2.getCount()) {
            return 0;
        } else if (o1.getCount() > o2.getCount()) {
            return -1;
        }
        return 1;
    }
}
