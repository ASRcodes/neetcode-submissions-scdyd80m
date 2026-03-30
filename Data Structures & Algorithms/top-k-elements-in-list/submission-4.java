class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,1)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> heap = new
        PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        for(Map.Entry<Integer,Integer> mapp : map.entrySet()){
            heap.add(mapp);
            if(heap.size()>k) heap.poll();
        }
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = heap.poll().getKey();
        }
        return res;
    }
}
