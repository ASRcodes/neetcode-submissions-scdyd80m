class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int i = 0;
        int maxlen = 0;
        int maxfreq = 0;
    
        for(int j =0;j<s.length();j++){
            char ch = s.charAt(j);
            freq[ch-'A']++;
            maxfreq = Math.max(maxfreq,freq[ch-'A']);

            while(j-i+1 - maxfreq > k){
                freq[s.charAt(i)-'A']--;
                i++;
            }

            maxlen = Math.max(maxlen,j-i+1);
        }
        return maxlen;
    }
}
