class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] freq = new int[26];
        for(char ch : s1.toCharArray()) freq[ch-'a']++;
        int window = s1.length();
        int left = 0;
        int[] freq2 = new int[26];
        for(int right=0;right<s2.length();right++){
            char ch = s2.charAt(right);
            freq2[ch-'a']++;
            window--;

            while(window==0){
                if(Arrays.equals(freq,freq2)) return true;
                char chh = s2.charAt(left);
                freq2[chh-'a']--;
                left++;
                window++;
            }
            
        }
        return false;
    }
}
