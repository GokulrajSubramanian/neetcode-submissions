class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();
        int output=0;
        if(tokens.length<2){
            return Integer.parseInt(tokens[0]);
        }
        for(String val: tokens){
            if(val.equals("+") || val.equals("-") || val.equals("*") || val.equals("/")){
                int num1 = stack.peek();
                stack.pop();
                output= stack.peek();
                stack.pop();
                if(val.equals("+")){
                    output += num1;
                    stack.push(output);
                }else if(val.equals("-")){
                    output -= num1;
                     stack.push(output);
                }else if(val.equals("*")){
                    output *= num1;
                     stack.push(output);
                }else{
                    output /= num1;
                     stack.push(output);
                }
            }else{
                stack.push(Integer.parseInt(val));
            }
        }
        return output;
    }
}
