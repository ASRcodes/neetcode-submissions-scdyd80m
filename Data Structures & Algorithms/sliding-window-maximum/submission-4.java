class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length-k+1];
        int index=0;
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){

            //shrink
            while(!dq.isEmpty() && dq.peekFirst()<=i-k) dq.removeFirst();

            //remove smaller
            while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()]) dq.removeLast();
            dq.addLast(i);
            if(i+1>=k){
                ans[index++] = nums[dq.peekFirst()];
            }
        }
        return ans;
    }
}
