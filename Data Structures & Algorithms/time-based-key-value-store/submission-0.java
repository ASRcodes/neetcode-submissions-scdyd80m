class TimeMap {
    HashMap<String,List<Pair>> map;
    class Pair{
        int timestamp;
        String value;

        Pair(int t,String v){
            this.timestamp = t;
            this.value = v;
        }
    }
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key,new ArrayList<>());
        map.get(key).add(new Pair(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";

        List<Pair> list = map.get(key);

        int i = 0,j = list.size()-1;
        String res = "";

        while(i<=j){
            int mid = (i+j)/2;

            if(list.get(mid).timestamp <= timestamp){
                res = list.get(mid).value;
                i = mid + 1;
            }else{
                j = mid-1;
            }
        }
        return res;
    }
}
