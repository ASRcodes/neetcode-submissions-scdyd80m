class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        double res = 0;
        int[] arr = new int[n+m];

        for(int i=0;i<n;i++){
            arr[i] = nums1[i];
        }
        for(int i=0;i<m;i++){
            arr[n+i] = nums2[i];
        }
        Arrays.sort(arr);

        int len = arr.length;
        if(len%2!=0){
            int mid = len/2;
            res = arr[mid];
        }
        else{
            int left = (len/2)-1; int right = len/2;
            res = (arr[left]+arr[right])/2.0;
        }
    return res;
    }
}
