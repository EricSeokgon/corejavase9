package ch11.sec01;

public class sec01 {
    static class Sequence {
        private int from;
        private int to;

        class Iterator implements java.util.Iterator<Integer> {
            private int current;
            public Iterator(Sequence Sequence.this) {
                this.current = Sequence.this.from;
            }

            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Integer next() {
                return null;
            }
        }
    }

}
