public class BinarySearchTree<Key extends Comparable<Key>, Value> {

    private Node<Key, Value> root;

    public BinarySearchTree() {
        root = null;
    }

    public int size() {
        return size(root);
    }

    private int size(Node x) {
        if(x == null) {
            return 0;
        } else {
            return x.getSize();
        }
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    private Node<Key,Value> put(Node<Key, Value> n, Key key, Value val) {
        if(n == null)  {
            return new Node<Key, Value>(key, val, 1);
        }
        int i = key.compareTo(n.getKey());
        if(i < 0) {
            n.setLeft(put(n.getLeft(), key, val));
        } else if( i > 0) {
            n.setRight(put(n.getRight(), key, val));
        } else {
            n.setValue(val);
        }
        n.setSize(1 + size(n.getLeft()) + size(n.getRight()));
        return n;
    }

    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node<Key, Value> n, Key key) {
        if(n == null) return null;
        int i = key.compareTo(n.getKey());
        if(i < 0) {
            return get(n.getLeft(), key);
        } else if(i > 0) {
            return get(n.getRight(), key);
        } else {
            return n.getValue();
        }

    }

    public boolean contains(Key key) {
        return get(key) != null;
    }

    public Value remove(Key key) {
        Value v = get(key);
        root = remove(root, key);
        return v;
    }

    private Node remove(Node<Key, Value> n, Key key) {
        if(n == null) return null;
        int i = key.compareTo(n.getKey());
        if( i < 0) {
            n.setLeft(remove(n.getLeft(), key));
        } else if(i > 0) {
            n.setRight(remove(n.getRight(), key));
        }else {
            if(n.getRight() == null) return n.getLeft();
            if(n.getLeft() == null) return n.getRight();
            Node min = min(n.getRight());
            min.setLeft(n.getLeft());
            n = n.getRight();
        }
        n.setSize(size(n.getRight()) + size(n.getLeft()) + 1);
        return n;
    }

    public Key min() {
        return min(root).getKey();
    }

    private Node<Key, Value> min(Node<Key, Value> n) {
        if(n.getLeft() == null) return n;
        return min(n.getLeft());
    }

    public Key max() {
        return max(root).getKey();
    }

    private Node<Key, Value> max(Node<Key, Value> n) {
        if(n.getRight() == null) return n;
        return max(n.getRight());
    }
}
