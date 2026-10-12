class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] cars = new int[position.length][2];

        for(int i = 0; i<position.length; i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars, (a, b) -> (b[0] - a[0]));
        for(int i =0; i<position.length; i++){
            position[i] = cars[i][0];
            speed[i] = cars[i][1];
        }

        Stack<Float> stack = new Stack<>();
        for(int i = 0; i< position.length; i++){
            float time = (float)(target - position[i])/speed[i];
            if(stack.empty() || time > stack.peek()){
                stack.push(time);
            }
        }
        return stack.size();

    }
}
