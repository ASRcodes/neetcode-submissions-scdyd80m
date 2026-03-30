class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int  i1=i+1,i2=nums.length-1;
            while(i1<i2){
                int sum = nums[i]+nums[i1]+nums[i2];
                if(sum==0){ 
                    res.add(Arrays.asList(nums[i],nums[i1],nums[i2]));
                    i1++;i2--;
                    while(i1<i2 && nums[i1]==nums[i1-1]) i1++;
                    while(i1<i2 && nums[i2]==nums[i2+1]) i2--;
                }
                else if(sum>0) i2--;
                else i1++;
            }
        }
        return res;
    }
}
