class Solution {
    public String minWindow(String s, String t) {
        int[] fre = new int[128];
        for(char ch : t.toCharArray()) fre[ch]++;
        int right = 0,left=0;
        int start = 0;
        int count = t.length();
        int len = Integer.MAX_VALUE;
        while(right<s.length()){
                       char ch = s.charAt(right);

            if(fre[ch]>0) count--;

            fre[ch]--;
            right++;

            while(count==0){
                if(right-left<len){
                    len = right-left;
                    start = left;
                }

                fre[s.charAt(left)]++;
                if(fre[s.charAt(left)]>0) count++;
                left++;
            }
        }
        return len==Integer.MAX_VALUE?"":s.substring(start,start+len);
    }
}
