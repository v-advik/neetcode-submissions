class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){
            return new ArrayList();
        }

        Map<String, List<String>> map = new HashMap<>();

        //create frequencies for 26 letters of Array
        int[] count = new int[26];
        for(String s: strs){
            Arrays.fill(count, 0);
            for(char c: s.toCharArray()){
                count[c-'a']++;
            }

            // StringBuilder key = new StringBuilder();
            // for(int i=0;i<26;i++){
            //     // key.append("&");
            //     key.append(count[i]);
            // }
            // String k = key.toString();

            String k = Arrays.toString(count);
            
            map.putIfAbsent(k, new ArrayList<>());
            // if(!map.containsKey(k)){
            //     map.put(k, new ArrayList<>());
            // }
            map.get(k).add(s);
        }

        return new ArrayList(map.values());
        
    }
}
