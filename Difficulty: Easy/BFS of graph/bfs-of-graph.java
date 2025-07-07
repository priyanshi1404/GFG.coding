class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        final int V=adj.size();
        boolean isVisited[] = new boolean[V];
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(0);
        isVisited[0] = true;
        while(!queue.isEmpty()){
            int currentNode=queue.poll();
            result.add(currentNode);
            
            //getting to know the neighbours
            for(int neighbour: adj.get(currentNode)){
                if(!isVisited[neighbour]){
                    queue.add(neighbour);
                    isVisited[neighbour]= true;
                }
            }
        }
        return result;
    }
}