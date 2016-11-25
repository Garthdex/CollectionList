package Collections;

/**
 * Created by Antoine on 24.11.2016.
 */
public class ArrayListX<E> implements ListX{
    private Object elementData[];
    private int capacity;
    private int size;

    public ArrayListX() {
        this.elementData = (E[]) new Object[10];
        this.capacity = 10;
    }

    public ArrayListX(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException("Illegal capacity: " + capacity);
        this.elementData = (E[]) new Object[capacity];
        this.capacity = capacity;
    }

    public void add(Object object) {

        elementData[size] = object;
        size++;
    }

    public void remove(int index) {

    }

    public void replace(int index, Object object) {

    }

    public int size() {
        return elementData.length;
    }

    public void ensureCapacity() {
        // if(size == capacity) grow
    }
}
