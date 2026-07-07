class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            if(!set.contains(n)) set.add(n);
        } 

        int c = 0;
        for(int n : nums){
            if(!set.contains(n-1)){
                int curr = n;
                int len = 1;
                while(set.contains(curr+1)){
                    curr++;
                    len++;
                }

                c=Math.max(len,c);
            }
        }
        return c;
    }
}
