class Solution {
    public String freStr(String s){
        int[] fre = new int[26];
        for(char ch : s.toCharArray()) fre[ch-'a']++;

        StringBuilder sb = new StringBuilder();
        char ch = 'a';
        for(int n : fre){
            sb.append(ch);
            sb.append(n);
            ch++;
        }
        return sb.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();

        for(String s : strs){
            String str = freStr(s);
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
