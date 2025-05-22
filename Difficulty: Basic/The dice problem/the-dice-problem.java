// User function Template for Java
class Solution {
    static int oppositeFaceOfDice(int n) {
        // code here
        if(n<1 || n>6 ){
            return 0;
        }
        else{
            int opposite= 7-n;
            return opposite;
        }
    }
}