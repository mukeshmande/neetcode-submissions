class Solution {
    public int[] sortArray(int[] nums) {
    
    mergeSort(nums, 0, nums.length - 1);
    return nums;

    }

    public void mergeSort(int[] nums, int left, int right){
        if(left< right){
            int mid = left+ (right-left)/2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid+1, right);
            mergeSort(nums, left, mid, right);
        }
    }

    public void mergeSort(int[] nums, int left, int mid, int right){
        int lSize = mid - left + 1;
        int rSize = right - mid;

        int[] lArray = new int[lSize];
        int[] rArray = new int[rSize];

        for (int i=0; i< lSize; i++){
            lArray[i] = nums[left+i];
        }

        for (int i=0; i< rSize; i++){
            rArray[i] = nums[mid+1+i];
        }

        int i=0, j=0, k=left;
        while(i<lSize && j<rSize){
            if(lArray[i]<rArray[j]){
                nums[k] = lArray[i];
                i++;
            }else {
                nums[k] = rArray[j];
                j++;
            }
            k++;
        }

        while(i<lSize){
            nums[k] = lArray[i];
            i++;
            k++;
        }

        while(j<rSize){
            nums[k] = rArray[j];
            j++;
            k++;
        }


    }
}