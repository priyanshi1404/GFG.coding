/*Complete the function below*/
class GfG {
     public void sortHelper(Stack<Integer> s) {
        // base case
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        
        //Recursion build
        sortHelper(s);
        
        //recursion fall
        doSort(top,s);
    }
    public Stack<Integer> sort(Stack<Integer> s) {
       sortHelper(s);
       return s;
    }
    void doSort(int top, Stack<Integer> s){
        if(s.isEmpty() || s.peek() < top){
            s.push(top);
            return;
        }
        int topValue= s.pop();
        doSort(top,s);
        s.push(topValue);
        
    }
}