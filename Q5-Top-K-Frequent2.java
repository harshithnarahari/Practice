//TC:O(N) SC:O(N) 
//beautiful approach
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        List<Integer>[] fArr = new List[nums.length + 1];
        
        for(int i = 0; i < fArr.length; i++) {
            fArr[i] = new ArrayList<>();
        }
        
        for(int num : map.keySet()) {
            fArr[map.get(num)].add(num);
        }
        
        List<Integer> f = new ArrayList<>();
        for(int i = fArr.length - 1; i >= 0; i--) {
            for(int num : fArr[i]) {
                f.add(num);
            }
        }
        
        int[] top = new int[k];
        for(int i = 0; i < k; i++) {
            top[i] = f.get(i);
        }
        return top;
    }
}