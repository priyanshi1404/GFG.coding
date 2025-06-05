// User function Template for Java
class Solution {
    public int maxConsecutiveCount(int[] arr) {
        // code here
        int count=1;
        int n=arr.length;
        int maxCount=1;
        
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
             count++;
             maxCount=Math.max(maxCount,count);
            }
            else{
               count=1;
            }
        }
        return maxCount;
    }
}
