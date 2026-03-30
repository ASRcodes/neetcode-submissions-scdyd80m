class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        for(char ch : s.toCharArray()){
            arr[ch-'a']++;
        }
        for(char ch : t.toCharArray()){
            arr[ch-'a']--;
        }
        for(int n : arr){
            if(n!=0) return false;
        }
        return true;
    }
}
