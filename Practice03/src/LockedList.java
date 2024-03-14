import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockedList<T> implements List<T> {
    private final List<T> list;
    private static final Lock lock = new ReentrantLock();

    public LockedList() {
        list = new ArrayList<>();
    }
    @Override
    public int size() {
        lock.lock();
        int size = list.size();
        lock.unlock();
        return size;
    }

    @Override
    public boolean isEmpty() {
        lock.lock();
        boolean empty = list.isEmpty();
        lock.unlock();
        return empty;
    }

    @Override
    public boolean contains(Object o) {
        lock.lock();
        boolean contains = list.contains(o);
        lock.unlock();
        return contains;
    }

    @Override
    public Iterator<T> iterator() {
        lock.lock();
        Iterator<T> iterator = list.iterator();
        lock.unlock();
        return iterator;
    }

    @Override
    public Object[] toArray() {
        lock.lock();
        Object[] array = list.toArray();
        lock.unlock();
        return array;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        lock.lock();
        T1[] array = list.toArray(a);
        lock.unlock();
        return array;
    }

    @Override
    public boolean add(T t) {
        lock.lock();
        boolean add = list.add(t);
        lock.unlock();
        return add;
    }

    @Override
    public boolean remove(Object o) {
        lock.lock();
        boolean remove = list.remove(o);
        lock.unlock();
        return remove;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        lock.lock();
        boolean containsAll = list.containsAll(c);
        lock.unlock();
        return containsAll;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        lock.lock();
        boolean addAll = list.addAll(c);
        lock.unlock();
        return addAll;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        lock.lock();
        boolean addAll = list.addAll(index, c);
        lock.unlock();
        return addAll;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        lock.lock();
        boolean removeAll = list.removeAll(c);
        lock.unlock();
        return removeAll;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        lock.lock();
        boolean retainAll = list.retainAll(c);
        lock.unlock();
        return retainAll;
    }

    @Override
    public void clear() {
        lock.lock();
        list.clear();
        lock.unlock();
    }

    @Override
    public T get(int index) {
        lock.lock();
        T t = list.get(index);
        lock.unlock();
        return t;
    }

    @Override
    public T set(int index, T element) {
        lock.lock();
        T t = list.set(index, element);
        lock.unlock();
        return t;
    }

    @Override
    public void add(int index, T element) {
        lock.lock();
        list.add(index, element);
        lock.unlock();
    }

    @Override
    public T remove(int index) {
        lock.lock();
        T t = list.remove(index);
        lock.unlock();
        return t;
    }

    @Override
    public int indexOf(Object o) {
        lock.lock();
        int indexOf = list.indexOf(o);
        lock.unlock();
        return indexOf;
    }

    @Override
    public int lastIndexOf(Object o) {
        lock.lock();
        int lastIndexOf = list.lastIndexOf(o);
        lock.unlock();
        return lastIndexOf;
    }

    @Override
    public ListIterator<T> listIterator() {
        lock.lock();
        ListIterator<T> listIterator = list.listIterator();
        lock.unlock();
        return listIterator;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        lock.lock();
        ListIterator<T> listIterator = list.listIterator(index);
        lock.unlock();
        return listIterator;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        lock.lock();
        List<T> subList = list.subList(fromIndex, toIndex);
        lock.unlock();
        return subList;
    }
}
