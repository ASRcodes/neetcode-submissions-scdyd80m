class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int maxlen = 0;
        HashSet<Character> set = new HashSet<>();
        for(int j=0;j<s.length();j++){
            char ch = s.charAt(j);

            while(set.contains(ch)){
                if(set.contains(s.charAt(i))) set.remove(s.charAt(i));
                i++;
            }

            set.add(ch);
            maxlen = Math.max(maxlen,j-i+1);
        }
        return maxlen;
    }
}
