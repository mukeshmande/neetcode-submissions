class Solution {
    public int firstMissingPositive(int[] nums) {
        int smallestInt = 1;
        HashSet<Integer> items  = new HashSet<>();
        for(int num: nums){
            if(num > 0)
           items.add(num);
        }

        while(items.contains(smallestInt)){
            smallestInt++;
        }
        return smallestInt;
    }
}