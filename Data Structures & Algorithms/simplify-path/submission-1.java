class Solution {
    public String simplifyPath(String path) {
        String[] paths = path.split("/");
        Stack<String> stack = new Stack<>();

        for(String p: paths){
            if(p.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else if(!p.equals("") && !p.equals(".")){
                stack.push(p);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String s: stack){
            sb.append("/").append(s);
        }

        return sb.length() == 0? "/" : sb.toString();

    }
}