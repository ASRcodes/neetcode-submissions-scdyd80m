class Solution {
    public String getFreqStr(String s){
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int n : freq){
            char c = 'a';
            sb.append(c);
            sb.append(n);
            c++;
        }
        return sb.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0) return new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            String strFreq = getFreqStr(s);
            if(map.containsKey(strFreq)){
                map.get(strFreq).add(s);
            }else{
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(strFreq,list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
