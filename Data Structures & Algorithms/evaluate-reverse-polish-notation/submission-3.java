class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();
        for(String val: tokens){
            if(val.equals("+") || val.equals("-") || val.equals("*") || val.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                int result=0;
                switch(val){
                    case "+":
                        result= a+b;
                        break;
                    case "-":
                        result= a-b;
                        break;
                    case "*":
                        result= a*b;
                        break;
                    case "/":
                        result= a/b;
                        break;
                }
                stack.push(result);
            }else{
                stack.push(Integer.parseInt(val));
            }
        }
        return stack.pop();
    }
}
