class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> heap = new 
        PriorityQueue<>((a,b)-> a.getValue()-b.getValue());

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            heap.add(entry);
            if(heap.size()>k) heap.poll();
        }
        int[] ans = new int[k];
        int i=0;
        while(!heap.isEmpty()){
            ans[i++] = heap.poll().getKey();
        }
        return ans;
    }
}
