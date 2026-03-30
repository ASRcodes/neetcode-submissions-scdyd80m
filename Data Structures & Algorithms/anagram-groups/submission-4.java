class Solution {
    public String freStr(String s){
        int[] freq = new int[26];
        for(char c : s.toCharArray()) freq[c-'a']++;
        StringBuilder sb = new StringBuilder();
        for(int n : freq){
            char ch = 'a';
            sb.append(ch);
            sb.append(n);
            ch++;
        }
        return sb.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0) return new ArrayList<>();
        HashMap<String,List<String>> mapStr = new HashMap<>();
        for(String s : strs){
            String fre = freStr(s);
            if(mapStr.containsKey(fre)) mapStr.get(fre).add(s);
            else{
                List<String> li = new ArrayList<>();
                li.add(s);
                mapStr.put(fre,li);
            }
        }
        return new ArrayList<>(mapStr.values());
    }
}
