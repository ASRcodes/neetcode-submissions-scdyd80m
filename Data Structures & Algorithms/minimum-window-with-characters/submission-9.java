class Solution {
    public String minWindow(String s, String t) {
        int[] freq = new int[128];
        for(char ch : t.toCharArray()) freq[ch]++;

        int right=0,left=0,count=t.length(),start=0;
        int min = Integer.MAX_VALUE;

        while(right<s.length()){
            char ch = s.charAt(right);

            if(freq[ch]>0) count--;

            freq[ch]--;
            right++;

            while(count==0){
                if(min>right-left){
                    min = right-left;
                    start=left;
                }
                freq[s.charAt(left)]++;
                if(freq[s.charAt(left)]>0){
                    count++;
                }
                left++;
            }
        }
        return min==Integer.MAX_VALUE?"":s.substring(start,start+min);
    }
}
