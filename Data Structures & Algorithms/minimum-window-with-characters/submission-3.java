class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()) return "";

        int[] freq = new int[128];
        for(char ch : t.toCharArray()) freq[ch]++;

        int left = 0;
        int right = 0;
        int minlen = Integer.MAX_VALUE;
        int start = 0;
        int required = t.length();

        while(right < s.length()){
            char ch = s.charAt(right);

            if(freq[ch]>0){
                required--;
            }
            freq[ch]--;
            right++;

            while(required==0){
                if(right-left < minlen){
                    minlen = right-left;
                    start = left;
                }
                char leftchar = s.charAt(left);
                freq[leftchar]++;
                if(freq[leftchar]>0){
                    required++;
                }
                left++;
            }
        }
        if(minlen==Integer.MAX_VALUE) return "";
        else return s.substring(start,start+minlen);
        // return minlen==Integer.MAX_VALUE ? "": s.substring(start,start+minlen);
    }
}
