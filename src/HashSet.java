import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class HashSet<E> implements Set<E> {
    private final HashMap<E, Object> map;
    private static final Object DEFAULT_VALUE = new Object();

    public HashSet() {
        map = new HashMap<>();
    }
    @Override
    public int size() {
        return map.size();
    }
    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }
    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }
    @Override
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }
    @Override
    public Object[] toArray() {
        return null;
    }
    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }
    @Override
    public boolean add(E e) {
        return map.put(e, DEFAULT_VALUE) == null;
    }
    @Override
    public boolean remove(Object o) {
        return map.remove(o) != null;
    }
    @Override
    public boolean containsAll(Collection<?> c) {
        return map.keySet().containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean modified = false;
        for (E e : c) {
            if (add(e)) {
                modified = true;
            }
        }
        return modified;
    }
    @Override
    public boolean retainAll(Collection<?> c) {
        return map.keySet().retainAll(c);
    }
    @Override
    public boolean removeAll(Collection<?> c) {
        return map.keySet().removeAll(c);
    }
    @Override
    public void clear() {
        map.clear();
    }
    @Override
    public String toString() {
        return map.keySet().toString();
    }
}
