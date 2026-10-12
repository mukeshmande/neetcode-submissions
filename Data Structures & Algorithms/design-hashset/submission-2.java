class MyHashSet {

    int[] set;
    int count = 0;
    int currentIndex = 0;
    public MyHashSet() {
        set = new int[10];
        for (int i = 0; i < set.length; i++) {
            set[i] = -1;
        }

    }
    
    public void add(int key) {
        boolean exists = false;
        if(currentIndex == set.length-1) {
           int[] tmp = new int[set.length*10];
           for (int i=0; i<set.length; i++){
                tmp[i] = set[i];
           }
           set = tmp;
        }

        for (int i = 0; i<currentIndex; i++){
            if(set[i] == key){
                exists = true;
            }
        }

        if(!exists){
            set[currentIndex++] = key;;
        }            
    }
    
    public void remove(int key) {
        for(int i=0; i<currentIndex; i++){
             if(set[i] == key){
                while(i<currentIndex){
                   set[i] = set[i+1]; 
                   i++;
                }
                set[currentIndex - 1] = -1; // Reset last element
                currentIndex--;
                break;
            }
        }
    }
    
    public boolean contains(int key) {
        for (int i = 0; i<=currentIndex; i++){
            if(set[i] == key){
                return true;
            }
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */