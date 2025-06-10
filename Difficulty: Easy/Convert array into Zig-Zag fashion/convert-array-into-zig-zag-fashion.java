
class Solution {
    
    // Using SINGLE PASS approach
    
    public static boolean zigZag(int[] arr) {
        int n=arr.length;
        boolean less=true;
        
        for(int i=0;i<n-1;i++){
            if(less){
                if(arr[i]>=arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
                else {
                    if(arr[i]<=arr[i+1]){
                    swap(arr,i,i+1);
                }
                    
                }
                less=!less;
            }
            
           return true;
           
    }
        
        
        static void swap(int [] arr,int i, int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }

