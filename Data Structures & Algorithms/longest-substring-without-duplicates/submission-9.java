class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int i=0;
        int maxLen = 0;
        for(int j=0;j<=s.length()-1;j++){
            char ch = s.charAt(j);

            while(set.contains(ch)){
                set.remove(s.charAt(i));
                i++;
            }

            set.add(ch);
            maxLen = Math.max(maxLen,j-i+1);
        }
        return maxLen;
    }
}
