class Solution {
    public String freqStr(String s){
        int[] freq = new int[26];
        for(char ch : s.toCharArray()) freq[ch-'a']++;
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

        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            String str = freqStr(s);
            if(map.containsKey(str)){
                map.get(str).add(s);
            }else{
                List<String> li = new ArrayList<>();
                li.add(s);
                map.put(str,li);
            }
        }
        return new ArrayList<>(map.values());
    }
}
