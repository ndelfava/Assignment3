public class Node {
    int to, length;
    public Node(int to, int length) {
        this.to = to;
        this.length = length;
    }

    public String toString() {
        return "(" + this.to + ", " + this.length + ")";
    }
}
