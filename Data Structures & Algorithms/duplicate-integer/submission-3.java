class Solution {
    public boolean hasDuplicate(int[] nums) {

        // return Arrays.stream(nums).boxed().collect(Collectors.toSet()).size()<nums.length;

        // return Arrays.addLast(e).size()>nums.length;

        // return Arrays.stream(nums).distinct().count() <nums.length;
        HashSet<Integer> distinct = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(distinct.contains(nums[i])){
                return true;
            }
            distinct.add(nums[i]);
        }
        return false;
        
    }
}