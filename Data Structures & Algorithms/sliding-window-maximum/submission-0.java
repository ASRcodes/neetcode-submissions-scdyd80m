class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n-k+1];
        Deque<Integer> dq = new ArrayDeque<>();
        int idx = 0;
        for(int i =0;i<n;i++){
            while(!dq.isEmpty() && dq.peekFirst()<=i-k) dq.removeFirst();
            while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()]) dq.removeLast();

            dq.addLast(i);

            if(i+1>=k) res[idx++] = nums[dq.peekFirst()];
        }
        return res;
    }
}
