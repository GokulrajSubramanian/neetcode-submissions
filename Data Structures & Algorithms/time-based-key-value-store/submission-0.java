class TimeMap {

    static class TimeValue{
        String value;
        int timestamp;

        public TimeValue(String value, int timestamp)
        {
            this.value= value;
            this.timestamp=timestamp;
        }
    }
    Map<String, List<TimeValue>> store;
    public TimeMap() {
        store = new HashMap();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!store.containsKey(key)){
            List<TimeValue> list = new ArrayList<>();
            list.add(new TimeValue(value,timestamp));
            store.put(key, list);
        }
        store.get(key).add(new TimeValue(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!store.containsKey(key)){
            return "";
        }
        List<TimeValue> list = store.get(key);
        int seen =-1;
        int left=0;
        int right = list.size()-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            int listTimestamp = list.get(mid).timestamp;
            if(listTimestamp<=timestamp){
                seen = mid;
                left = mid+1;
            }else{
                right=mid-1;
            }
        }
        if(seen !=-1){
            return list.get(seen).value;
        }else{
            return "";
        }
    }
}
