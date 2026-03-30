class Solution {
    public boolean isAnagram(String s,String t){
        if(s.length()!=t.length()) return false;
        int[] freq = new int[26];
        for(char c : s.toCharArray()) freq[c-'a']++;
        for(char c : t.toCharArray()) freq[c-'a']--;
        for(int n : freq) if(n!=0) return false;
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];
        for(int i=0;i<=strs.length-1;i++){
            if(visited[i]) continue;

            String str1 = strs[i];
            List<String> li = new ArrayList<>();
            li.add(str1);
            visited[i] = true;
            for(int j=i+1;j<strs.length;j++){
                String str2 = strs[j];
                if(!visited[j] && isAnagram(str1,str2)){
                    li.add(str2);
                    visited[j]=true;                    
                }
            }
            result.add(li);
        }
        return result;
    }
}
