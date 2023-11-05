package org.example;

public class Pair<T1, T2> {
    T1 t1;
    T2 t2;

    Pair(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;

    }

    public T1 getFirst() {
        return t1;
    }

    public T2 getSecond() {
        return t2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("first item is: ").append(t1).append("\n");
        sb.append("second item is: ").append(t2);
        return sb.toString();
    }
}
