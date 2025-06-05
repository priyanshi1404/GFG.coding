class Solution {
    
    //Approach 01- BRUTE FORCE
    
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList <Integer> result=new ArrayList<>();
        int n=arr.length;
        
        int max=arr[n-1];   //last element is always leader element
        result.add(max);
        
        for(int i=n-2; i>=0; i--){
            if(arr[i]>=max){
                max=arr[i];       //update previous maximum with the current maximum
                result.add(max); //add the leader number into the list now
                
            }
        }
        Collections.reverse(result);  //reverse the list since we are traversing array from back
        return result;
    }
}
