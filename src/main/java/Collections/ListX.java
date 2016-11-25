package Collections;

/**
 * Created by Antoine on 25.11.2016.
 */
public interface ListX<E> {
    void add(Object object);
    void remove(int index);
    void replace(int index, Object object);
    int size();
}
