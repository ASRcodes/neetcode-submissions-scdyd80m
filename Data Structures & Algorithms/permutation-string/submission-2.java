class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(char c : s1.toCharArray()) freq1[c-'a']++;

        int j =0;
        int k = s1.length();
        for(int i =0;i<s2.length();i++){
            char ch = s2.charAt(i);
            freq2[ch-'a']++;
            
            while(i-j+1 > k){
                freq2[s2.charAt(j)-'a']--;
                j++;
            }

            if(i-j+1 == k){
                if(Arrays.equals(freq1,freq2)) return true;
            }
        }
        return false;
    }
}
