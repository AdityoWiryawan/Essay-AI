import java.util.Vector;

class Node {
    int[] state = new int[9];
    int cost;
    Node parent = null;
    Vector<Node> successors = new Vector<Node>();
    Node(int s[], Node parent) {
        this.parent = parent;
        for (int i = 0; i < 9; i++) state[i] = s[i];
    }
    public String toString() {
        String s = "";
        for (int i = 0; i < 9; i++) {
            s = s + state[i] + " "; }
        return s;
    }

    public boolean equals(Object node) {
        Node n = (Node)node;
        boolean result = true;
        for (int i = 0; i < 9; i++) {
            if (n.state[i] != state[i]) result = false; }
        return result;
    }
    Vector<Node> getPath(Vector<Node> v) {
        v.insertElementAt(this, 0);
        if (parent != null) v = parent.getPath(v);
        return v;
    }
    Vector<Node> getPath() {
        return getPath(new Vector<Node>());
    }
}