class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,(a,b)-> a.getValue()-b.getValue());

        int[] res = new int[k];
        int index = 0;
        for(int i=list.size()-1;i>=list.size()-k;i--){
            res[index++] =  list.get(i).getKey();
        }
        return res;
    }
}
