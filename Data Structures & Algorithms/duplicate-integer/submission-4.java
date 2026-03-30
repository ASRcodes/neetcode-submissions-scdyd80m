class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hh = new HashSet<>();
        for(int n : nums){
            if(hh.contains(n)) return true;
            hh.add(n);
        }
        return false;
    }
}