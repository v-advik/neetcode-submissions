class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length==k){
            return nums;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a,b)->map.get(a)-map.get(b)
        );
        for(Integer fre: map.keySet()){
            heap.add(fre);
            if(heap.size()>k){
                heap.poll();
            }
        }
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i]=heap.poll();
        }
        return res;
        
    }
}
