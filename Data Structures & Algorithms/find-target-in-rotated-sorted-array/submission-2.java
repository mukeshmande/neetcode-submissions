class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length-1;
        while(l<r){
            int mid = l + (r-l)/2;
            if(nums[mid] > nums[r]){
                l = mid+1;
            }else if(nums[mid] < nums[r]){
                r = mid;
            }
        }
        int pivote = l;
         l = 0;
          r = nums.length-1;
        if(target >= nums[pivote] && target <= nums[r]){
            l = pivote;
        }else{
            r = pivote-1;
        }

        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target){
                r = mid-1;
            }else l = mid +1;
        }


        return -1;
    }
}
