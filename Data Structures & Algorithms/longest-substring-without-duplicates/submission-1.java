class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
        int i = 0;
        int maxlen = 0;
        for(int j=0;j<arr.length;j++){
            char ch = arr[j];

            while(set.contains(ch)){
                set.remove(arr[i]);
                i++;
            }

            set.add(ch);
            maxlen = Math.max(maxlen,j-i+1);
        }
        return maxlen;
    }
}
