class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length-k+1];
        Deque<Integer> dq = new ArrayDeque<>();

        int idx = 0;

        for(int i =0;i<nums.length;i++){
            // Shrinking window
            while(!dq.isEmpty() && dq.peekFirst()<=i-k) dq.removeFirst();
            // Removing smaller index values
            while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()]) dq.removeLast();

            // Adding element index to last always
            dq.addLast(i);

            // Putting max value in res
            if(i+1>=k) res[idx++] = nums[dq.peekFirst()];
        }
        return res;
    }
}
