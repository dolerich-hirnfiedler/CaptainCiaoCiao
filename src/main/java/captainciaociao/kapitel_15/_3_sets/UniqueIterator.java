package captainciaociao.kapitel_15._3_sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UniqueIterator<E> implements Iterator<E> {

    private Iterator<? extends E> iterator;
    private E next;
    private final Set<E> hasSeenSet = new HashSet<>();

    /**
     *
     */
    public UniqueIterator(Iterator<? extends E> iterator) {
        this.iterator = iterator;
        next = lookahead();
    }

    private E lookahead() {
        while (iterator.hasNext()) {
            E next = iterator.next();
            if (!hasSeenSet.contains(next)) {
                return next;
            }
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }

    @Override
    public E next() {
        E result = next;
        hasSeenSet.add(result);
        next = lookahead();
        return result;
    }

}
