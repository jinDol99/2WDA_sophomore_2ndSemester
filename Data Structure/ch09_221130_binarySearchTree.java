import java.util.Comparator;

class Node<K, V> {
    K key;
    V data;
    Node<K, V> left;
    Node<K, V> right;

    // --- 생성자(constructor) --- //
    Node(K key, V data, Node<K, V> left, Node<K, V> right) {
        this.key = key;
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return data;
    }

    void print() {
        System.out.println(data);
    }
}

class BinTree<K, V> {
    private Node<K, V> root;

    // 비교자(Comparator)
    private Comparator<? super K> comparator = null;

    // --- 생성자(constructor) --- //
    public BinTree() {
        root = null;
    }

    // --- 생성자(constructor) --- //
    public BinTree(Comparator<? super K> c) {
        this();
        comparator = c;
    }

    // --- 두 키값을 비교 --- //
    // key1을 key2와 비교하여 값이 작으면 음수를, 값이 크면 양수를 반환
    private int comp(K key1, K key2) {
        return (comparator == null) ? 
            ((Comparable<k>) key1).compareTo(key2) : 
                comparator.compare(key1, key2);
    }

    // --- 키로 검색 --- //
    public V search(K key) {
        Node<K, V> p = root;

        while (true) {
            if (p == null)
                return null;
            int cond = comp(key, p.getKey());
            if(cond == 0)
                return p.getValue();
            else if (cond < 0)
                p = p.left;
            else
                p = p.right;
        }
    }

    // --- node를 뿌리로 하는 서브트리에 노드 <K, V>를 삽입 --- //
    private void addNode(Node<K, V> node, K key, V data) {
        int cond = comp(key, node.getKey());
        if (cond == 0) {
            return;
        } else if (cond < 0) {
            if(node.left == null)
                node.left = new Node(key, data, null, null);
                // 비교값이 삽입할 값보다 작으면서 왼쪽 노드가 비어있으면
                // 삽입할 값을 새로운 노드로 생성하여 저장
            else
                addNode(node.left, key, data);
                // 비교값이 삽입할 값보다 작으면서 왼쪽 노드에 값이 존재한다면
                // 해당 왼쪽 노드에 가서 다시 값을 비교 (재귀함수)
        } else {
            if(node.right == null)
                node.right = new Node(key, data, null, null);
                // 비교값이 삽입할 값보다 크면서 오른쪽 노드가 비어있으면
                // 삽입할 값을 새로운 노드로 생성하여 저장
            else
                addNode(node.right, key, data);
                // 비교값이 삽입할 값보다 크면서 오른쪽 노드에 값이 존재한다면
                // 해당 오른쪽 노드에 가서 다시 값을 비교 (재귀함수)
        }
    }

    private void printSubTree(Node node) {
        if (node != null) {
            printSubTree(node.left);
            System.out.println(node.key + " " + node.data);
            printSubTree(node.right);
        }
    }

    public void print() {
        printSubTree(root);
    }
}



public class ch09_221130_binarySearchTree {
    public static void main(String[] args) {
        BinTree<Integer, String> tree = new BinTree<Integer, String>();
        tree.addNode(3, "홍길동");
        tree.addNode(1, "김철수");
        tree.addNode(2, "이영희");
        tree.addNode(5, "바둑이");
        tree.addNode(4, "남궁민수");
        // key 값을 트리 정렬방식에 맞게 삽입하기 위해 일부러
        // addNode의 key 값을 위와 같이 설정

        String result = tree.search(2);
        System.out.println(result);

        System.out.println();

        tree.print();
    }
}

// 38 페이지에 있는 print() 방식을 기존 중위 순회 방식에서
// 망할 후위 순회 방식으로 출력되도록 변경해보자