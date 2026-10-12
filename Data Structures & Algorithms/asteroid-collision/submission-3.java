class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int ast: asteroids){
            
           while(!stack.empty() && ast < 0 && stack.peek() > 0){
            int diff = stack.peek() + ast;
            if(diff < 0){
                stack.pop();
            }else if(diff > 0){
                ast = 0;
            }else {
                ast = 0;
                stack.pop();
            }
           }

           if(ast != 0){
            stack.push(ast);
           }
           
        }

        return stack.stream().mapToInt(i -> i).toArray();
       
    }
}