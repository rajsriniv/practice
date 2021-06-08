package raj.practice.queue.config;

import java.util.Objects;

public class Data {

    private int value;

    private int count;

    public Data(int value) {
        this.value = value;
        this.count += 1;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return value == data.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "Data{" +
                "value=" + value +
                ", count=" + count +
                '}';
    }
}
