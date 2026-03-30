class Solution {
    public String freqStr(String s){
        int[] freq = new int[26];
        for(char str : s.toCharArray()){
            freq[str-'a']++;
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
        if(strs.length==0 || strs==null) return new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            String st = freqStr(s);
            if(map.containsKey(st)){
                map.get(st).add(s);
            }else{
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(st,list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
