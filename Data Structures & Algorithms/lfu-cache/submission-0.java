class LFUCache {
    int capacity, timestamp;
    Map<Integer, Node> cache;
    public LFUCache(int capacity) {
        this.cache = new HashMap<>();
        this.capacity = capacity;
        this.timestamp = 0;
    }
    
    public int get(int key) {
        if(!cache.containsKey(key)) return -1;

        Node node = cache.get(key);
        node.freq++;
        node.timestamp = ++timestamp;
        return node.value;
    }
    
    public void put(int key, int value) {
        if(capacity <= 0) return;
        ++timestamp;
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            node.value = value;
            node.freq++;
            node.timestamp = timestamp;
            return;
        }

        if(cache.size() >= capacity){
            int minFreq = Integer.MAX_VALUE,
            minTimestamp = Integer.MAX_VALUE,
            lfu = -1;
            for(Map.Entry<Integer, Node> entry : cache.entrySet()){
                Node node = entry.getValue();
                if(node.freq < minFreq || (node.freq == minFreq && node.timestamp < minTimestamp)){
                    minFreq = node.freq;
                    minTimestamp = node.timestamp;
                    lfu = entry.getKey();
                }
            }
            cache.remove(lfu);
        }
        cache.put(key, new Node(value, 1, timestamp));
    }
}

class Node{
    int value, freq, timestamp;
    Node(int value, int freq, int timestamp){
        this.value = value;
        this.freq = freq;
        this.timestamp = timestamp;
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */