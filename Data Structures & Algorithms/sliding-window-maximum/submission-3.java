class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length-k+1];
        Deque<Integer> dq = new ArrayDeque<>();
        int idx = 0;
        for(int i = 0;i<nums.length;i++){
            // Shrink
            while(!dq.isEmpty() && dq.peekFirst()<=i-k) dq.removeFirst();
            // Remove smaller
            while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()]) dq.removeLast();

            dq.addLast(i);
            if(i+1>=k){
                res[idx++] = nums[dq.peekFirst()];
            }
        }
        return res;
    }
}
