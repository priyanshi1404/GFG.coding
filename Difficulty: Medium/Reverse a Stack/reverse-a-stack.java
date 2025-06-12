// User function Template for Java

class Solution {
    static void reverse(Stack<Integer> s) {
        // base case
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        
        //Stack fall
        insertAtBottom(top, s);
    }
    
     static void insertAtBottom(int topValue, Stack<Integer> stack){
        if(stack.isEmpty()){
            stack.push(topValue);
            return;
        }
        int top=stack.pop();
        insertAtBottom(topValue,stack);
        stack.push(top);
    }
}