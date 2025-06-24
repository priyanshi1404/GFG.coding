class Solution {
    public static String infixToPostfix(String s) {
        StringBuilder result= new StringBuilder();
        Stack<Character> stack=new Stack<>();
        
        //Scan from left to right
        for(char ch: s.toCharArray()){
            //if operand comes put it in result
            if(Character.isLetterOrDigit(ch)){
                result.append(ch);
            }
            //checking the brackets
            //if opening bracket is found push it inside the stack
            else if(ch == '('){
                stack.push(ch);
            }
            //if closing bracket is found, pop it
            else if(ch == ')'){
                while(!stack.isEmpty() && stack.peek()!= '('){
                    result.append(stack.pop());
                }
                stack.pop();
            }
             //if operator comes put it in stack(push or pop based on their precendence)
             else{
                 while(!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())){
                     result.append(stack.pop());
                 }
                 stack.push(ch);
             }
        }
        //pop the remaining operators
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result.toString();
       
    }
    static int precedence(char operator){
        switch(operator){
            case '+':
                case '-':
                    return 1;
            case '*':
                case '/':
                    return 2;
            case '^':
                return 3;
            default: return 0;
        }
    }
}