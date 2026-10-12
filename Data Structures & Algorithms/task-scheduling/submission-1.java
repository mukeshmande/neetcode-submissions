class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
            Collections.reverseOrder()
        );

        int[] count = new int[26];
        for(int task: tasks){
            count[task - 'A']++;
        }

        for(int cnt: count){
            if(cnt > 0){
                maxHeap.offer(cnt);
            }
        }

        int time = 0;
        Queue<int[]> q = new LinkedList<>();
        while(!maxHeap.isEmpty() || !q.isEmpty()){
            time++;
            if(maxHeap.isEmpty()){
                time = q.peek()[1];
            }else{
                int cnt = maxHeap.poll()-1;
                if(cnt > 0){
                    q.offer(new int[]{cnt, time+n});
                }
            }

            if(!q.isEmpty() && q.peek()[1] == time){
                maxHeap.offer(q.poll()[0]);
            }
        }
        return time;
    }
}
