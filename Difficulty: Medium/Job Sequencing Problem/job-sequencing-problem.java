class Job{
    int id;
    int profit;
    int deadLine;
    Job(int id,int profit, int deadLine){
        this.id=id;
        this.profit=profit;
        this.deadLine=deadLine;
    }
}
class Solution {

    public ArrayList<Integer> jobSequencing(int[] deadLine, int[] profit) {
        // code here
        int n=deadLine.length;
        Job jobs[] = new Job[n];
        
        //fill the jobs
        for(int i=0; i<n; i++){
            jobs[i] = new Job(i+1, profit[i],deadLine[i]);
        }
        //Sort by Profit
        Arrays.sort(jobs,(a,b)->b.profit - a.profit);
        boolean slots[] = new boolean[n + 1];
        int countJobs=0;
        int maxProfit=0;
        
        for(Job job:jobs){
            for(int j=job.deadLine;j>0;j--){
                if(!slots[j]){
                    slots[j] = true;
                    countJobs++;
                    maxProfit = maxProfit+ job.profit;
                    break;
                }
            }
        }
        ArrayList<Integer> result= new ArrayList<>();
        result.add(countJobs);
        result.add(maxProfit);
        return result;
    }
}