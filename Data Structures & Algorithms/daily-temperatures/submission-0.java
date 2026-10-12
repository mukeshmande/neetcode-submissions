class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[temperatures.length];
        for(int i = 0; i<n; i++){
            if(stack.empty()){
                stack.push(i);
            }else{
                while(!stack.empty() && temperatures[i] > temperatures[stack.peek()]){
                    int top = stack.pop();
                    res[top] = i - top;
                }
                stack.push(i);
                
            }
        }
        return res;
    }
}
