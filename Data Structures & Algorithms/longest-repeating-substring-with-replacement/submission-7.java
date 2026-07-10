class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int maxLen = 0;
        int len = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch-'A']++;
            maxLen = Math.max(maxLen,freq[ch-'A']);

            while(i-left+1 - maxLen > k){
                char c = s.charAt(left);
                freq[c-'A']--;
                left++;
            }
            len = Math.max(len,i-left+1);
        }
        return len;
    }
}
