class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        //traversing through array storing the occurances
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        //traverse through the array again and see if any occurance is more than 1
        for(int i = 0; i < nums.length; i++) {
            if(map.get(nums[i]) > 1) return true;
        }      
        return false;    
    }
}