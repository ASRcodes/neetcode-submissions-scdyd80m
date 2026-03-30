class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(char ch : s1.toCharArray()) freq1[ch-'a']++;

        int k = s1.length();
        int i = 0;
        for(int j=0;j<s2.length();j++){
            freq2[s2.charAt(j)-'a']++;

            if(j-i+1 > k){
                freq2[s2.charAt(i)-'a']--;
                i++;
            }
            if(j-i+1 == k){
                if(Arrays.equals(freq1,freq2)) return true;
            }
        }
        return false;
    }
}
