package generic;

public class Pair <N, A>{
    private N first;
    private A second;

    public Pair(N first, A second) {
        this.first = first;
        this.second = second;
    }

    public N getFirst() {
        return first;
    }

    public void setFirst(N first) {
        this.first = first;
    }

    public A getSecond() {
        return second;
    }

    public void setSecond(A second) {
        this.second = second;
    }
}
