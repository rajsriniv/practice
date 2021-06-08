package raj.practice.queue;

import raj.practice.queue.config.Data;
import raj.practice.queue.config.DataComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice1 {

    public static List<Integer> findNMaxCount(List<Integer> input, int n) {
        if (input == null) {
            return null;
        }
        List<Integer> result = new ArrayList<>();
        List<Data> dataList = new ArrayList<>();
        for (Integer number : input) {
            Data data = new Data(number);
            if (dataList.contains(data)) {
                Data existing = dataList.get(dataList.indexOf(data));
                existing.setCount(existing.getCount() + 1);
                dataList.remove(data);
                dataList.add(existing);
            } else {
                dataList.add(data);
            }
        }
        Collections.sort(dataList, new DataComparator());
        for (int i = 0;i < n;i++) {
            result.add(dataList.get(i).getValue());
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> result = findNMaxCount(Arrays.asList(1, 1, 2, 2, 1, 3, 2, 4, 1, 4, 2, 1), 3);
        System.out.println(result);
    }
}
