package Chapter12.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("요소1");
        set.add("요소2");
        set.add("요소3");
        set.add("요소4");

        Iterator<String> iterator = new iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
        }
    }

    private static class iterator implements Iterator<String> {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public String next() {
            return null;
        }
    }
}
