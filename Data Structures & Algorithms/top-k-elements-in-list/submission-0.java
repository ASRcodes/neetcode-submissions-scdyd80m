class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // So whatever i understand about this question is that we have to 
        // return top k elements which are having most numbers in the array.
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
            PriorityQueue<Map.Entry<Integer,Integer>> heap = new 
            PriorityQueue<>((a,b) -> a.getValue() - b.getValue());

            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                heap.add(entry);
                if(heap.size()>k) heap.poll();
            }

            int[] res = new int[k];
            int i=0;
            while(!heap.isEmpty()){
                res[i++] = heap.poll().getKey();
            }
            return res;
    }
}
