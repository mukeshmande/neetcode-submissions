class LRUCache {
    int cap;
    Node left;
    Node right;
    Map<Integer, Node> cache;
    public LRUCache(int capacity) {
        this.cap = capacity;
        cache = new HashMap<>();
        this.left = new Node(0, 0);
        this.right = new Node(0, 0);
        left.next = right;
        right.pre = left;
    }
    
    public void removeNode(Node node){
        Node pre = node.pre;
        Node next = node.next;
        pre.next = next;
        next.pre = pre;
    }

    public void insertNode(Node node){
        Node pre = right.pre;
        pre.next = node;
        node.pre = pre;
        node.next = right;
        right.pre = node;

    }

    public int get(int key) {
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            removeNode(node);
            insertNode(node);
            return node.val;

        } 
        return -1;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            removeNode(cache.get(key));
        }
        Node node = new Node(key, value);
        cache.put(key, node);
        insertNode(node);
        if(cache.size() > cap){
            Node lru = left.next;
            removeNode(lru);
            cache.remove(lru.key);
        }
    }
}
class Node{
    int key;
    int val;
    Node pre;
    Node next;
    Node(int key, int val){
        this.key = key;
        this.val = val;
        this.pre = null;
        this.next = null;
    }
}