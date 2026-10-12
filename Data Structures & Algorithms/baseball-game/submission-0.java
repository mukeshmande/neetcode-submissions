class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for(String op : operations){
            switch(op) {
                case "+":
                    stack.push(stack.get(stack.size() - 2) + stack.peek());
                    break;
                case "C":
                    stack.pop();
                    break;
                case "D":
                    int top = stack.peek();
                    stack.push(2 * top);
                    break;
                default:
                    stack.push(Integer.parseInt(op));
                    break;

            }
        }

        while(!stack.empty()){
            res += stack.pop();
        }

        return res;
    }
}