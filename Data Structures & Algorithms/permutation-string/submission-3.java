class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] freq1 = new int[26];
        for(char ch : s1.toCharArray()) freq1[ch-'a']++;
        int[] freq2 = new int[26];
        int k = s1.length();
        int i = 0;
        for(int j=0;j<s2.length();j++){
            char ch = s2.charAt(j);
            freq2[ch-'a']++;
            
            while(j-i+1>k){
                char left = s2.charAt(i);
                freq2[left-'a']--;
                i++;
            }
            if(j-i+1 == k){
                if(Arrays.equals(freq1,freq2)){
                    return true;
                }
            }
        }
        return false;
     }
}
