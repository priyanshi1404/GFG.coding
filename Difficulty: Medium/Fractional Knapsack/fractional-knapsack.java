class Item{
    int value;
    int weight;
    Item(int value,int weight){
        this.value=value;
        this.weight=weight;
    }
}
class Solution {
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        // code hereeeeeergfdcfvv
        int n = values.length;
        
        Item[] items=new Item[n];
        
        for(int i=0;i<n;i++){
            items[i] = new Item(values[i],weights[i]);
        }
        
        Arrays.sort(items,(a,b)->{
            double ratio1= (double)a.value/a.weight;
            double ratio2=(double) b.value/b.weight;
            return Double.compare(ratio2,ratio1);
        });
        
        //compue the max value
        double maxValue= 0.0;
        for(int i=0;i<n;i++){
            if(W==0){
                break;  //bag full
            }
            if(items[i].weight<=W){
                maxValue=maxValue + items[i].value;
                W=W-items[i].weight;
            }
            else{
                maxValue=maxValue+ (double)(items[i].value*W) / items[i].weight;
                W=0;
            }
        }
        return maxValue;
        
    }
}