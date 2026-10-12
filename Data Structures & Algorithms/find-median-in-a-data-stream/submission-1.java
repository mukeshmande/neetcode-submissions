class MedianFinder {
    PriorityQueue<Integer> min;
    PriorityQueue<Integer> max;
    public MedianFinder() {
        min = new PriorityQueue<>();
        max = new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        if(max.isEmpty() || num < max.peek()){
            max.offer(num);
        }else {
            min.offer(num);
        }

        if(max.size() < min.size()){
            max.offer(min.poll());
        } else if(max.size() > min.size() + 1){
            min.offer(max.poll());
        }
    }
    
    public double findMedian() {
        if(max.size() == min.size()){
            return (max.peek() + min.peek())/2.0;
        }

        return max.peek();
    }
}
