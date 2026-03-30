class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()) return "";
        int[] freq = new int[128];
        for(char ch : t.toCharArray()) freq[ch]++;
        int required = t.length();
        int left=0,right=0,start=0,minlen=Integer.MAX_VALUE;
        while(right<s.length()){
            char ch = s.charAt(right);

            if(freq[ch]>0) required--;

            freq[ch]--;
            right++;

            while(required==0){
                if(right-left<minlen){
                    minlen = right-left;
                    start = left;
                } 
                char leftchar = s.charAt(left);
                freq[leftchar]++;
                if(freq[leftchar]>0) required++;
                left++;
            }
        }
        return minlen==Integer.MAX_VALUE ?"":s.substring(start,minlen+start);
    }
}
