package labN5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * A class that encapsulates an ArrayList.
 *
 * @param <T> the type of elements in this list, which must implement Comparable to sort list
 */
public class EncapsulatedArrayList<T extends Comparable<T>> {
    private ArrayList<T> arraylist;
    /**
     * Constructs an empty labN5.EncapsulatedArrayList.
     */
    public EncapsulatedArrayList() {
        this.arraylist = new ArrayList<>();
    }
    /**
     * Adds an element to the encapsulated ArrayList.
     *
     * @param element the element to be added to the list
     */
    public void add(T element) {
        arraylist.add(element);
    }
    /**
     * Returns an Iterable for iterating over the elements
     * in the order they were added to the list.
     *
     * @return an Iterable over the elements in sequential order
     */
    public Iterable<T> getIterator() {
        return arraylist;
    }
    /**
     * Returns an Iterable for iterating over the elements in sorted order.
     *
     * @return an Iterable over the elements in sorted order
     */
    public Iterable<T> getSortedIterator() {
        List<T> sortedList = new ArrayList<>(arraylist);
        Collections.sort(sortedList);
        return sortedList;
    }
}
