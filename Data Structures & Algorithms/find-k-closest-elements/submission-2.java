class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0, r = arr.length-1;
        List<Integer> list = new ArrayList<>();

        while((r-l) >=k){
            if(Math.abs(x-arr[l]) <= Math.abs(x-arr[r])){
                r--;
            }else{
                l++;
            }
        }

        for(int i=l; i<=r; i++){
            list.add(arr[i]);
        }

        return list;
    }
}