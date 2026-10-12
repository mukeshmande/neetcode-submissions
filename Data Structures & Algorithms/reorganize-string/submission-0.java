class Solution {
    public String reorganizeString(String s) {
        int[] freq = new int[26];
        for(char ch: s.toCharArray()){
            freq[ch - 'a']++;
        }
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for(int i = 0; i< 26; i++){
            if(freq[i] > 0){
                maxHeap.offer(new int[]{freq[i], i});
            }
        }
        StringBuilder res = new StringBuilder();
        int[] pre = null;
        while(!maxHeap.isEmpty() || pre != null){
            if(pre != null && maxHeap.isEmpty()){
                return "";
            }
            int[] curr = maxHeap.poll();
            res.append((char)(curr[1] +'a'));
            curr[0]--;

            if(pre != null){
                maxHeap.offer(pre);
                pre = null;
            }

            if(curr[0] > 0){
                pre = curr;
            }
        }
        return res.toString();
    }
}