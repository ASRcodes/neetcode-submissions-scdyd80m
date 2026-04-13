class Solution {
    public String freStr(String s){
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
        HashMap<String,List<String>> map = new HashMap<>();

        for(String s : strs){
            String freqstr = freStr(s);
            if(map.containsKey(freqstr)){
                map.get(freqstr).add(s);
            }else{
                List<String> li = new ArrayList<>();
                li.add(s);
                map.put(freqstr,li);
            }
        }
        return new ArrayList<>(map.values());
    }
}
