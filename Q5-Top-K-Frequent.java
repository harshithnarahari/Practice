//TC:O(NlogK) SC:O(N)
//can introduce a mild optimization where if K = N we just return the mnums array
// the sort method TC-> O(NlogN)
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        Queue<Integer> heap = new PriorityQueue<>((n1, n2) -> map.get(n1) - map.get(n2));
        
        for(int key : map.keySet()) {
            heap.add(key);
            if(heap.size() > k) {
                heap.poll();
            }
        }
        
        int[] freq = new int[k];
        for(int i = 0; i < k; i++) {
            freq[i] = heap.poll();
        }
        return freq;
    }
}