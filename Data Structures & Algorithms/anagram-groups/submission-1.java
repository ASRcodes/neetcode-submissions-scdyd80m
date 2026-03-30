class Solution {
    public boolean is_anagram(String s,String t){
        if(s.length()!=t.length()) return false;
        int[] freq = new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        for(char c:t.toCharArray()){
            freq[c-'a']--;
        }
        for(int n : freq){
            if(n!=0) return false;
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> group = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            if(visited[i]) continue;

            List<String> inner_group = new ArrayList<>();
            inner_group.add(strs[i]);
            visited[i] = true;
            for(int j=i+1;j<strs.length;j++){
                if(!visited[j] && is_anagram(strs[i],strs[j])){
                    visited[j] = true;
                    inner_group.add(strs[j]);
                }
            }
            group.add(inner_group);
        }
        return group;
    }
}
