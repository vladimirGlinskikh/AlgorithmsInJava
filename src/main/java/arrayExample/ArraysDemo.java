package arrayExample;

public class ArraysDemo {
    private long[] a;

    public ArraysDemo(int size) {
        a = new long[size];
    }

    public long setElem(int index, long value) {
        a[index] = value;
        return a[index];
    }

    public long getElem(int index) {
        return a[index];
    }
}
