import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

public class IteratorRandom implements Iterator<Integer> {
    private int start;
    private final int end;

    public IteratorRandom(int end) {
        start = 0;
        this.end = end;
    }

    @Override
    public boolean hasNext() {
        return start<end;
    }

    @Override
    public Integer next() {
        start++;
        return ThreadLocalRandom.current().nextInt(Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    public static void main(String[] args) {
        IteratorRandom iteratorRandom = new IteratorRandom(5);
        while (iteratorRandom.hasNext())
            System.out.println(iteratorRandom.next());
    }
}
