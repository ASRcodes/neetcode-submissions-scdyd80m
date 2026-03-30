class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        Set<Integer> set = new HashSet<>();
        for(int n : nums) set.add(n);
        int best = 0;
        for(int c : set){
            if(!set.contains(c-1)){
                int curr = c;
                int greatest = 1;
                while(set.contains(curr+1)){
                    greatest++;
                    curr++;
                }
                  best = Math.max(best,greatest);
            }
        }
        return best;
    }
}
