class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int j = 0;
            int product = 1;
            while(j<nums.length){
                if(j!=i){
                    product*=nums[j];
                }
                j++;
            }
        result[i] = product;

        }

        return result;
    }
}  
