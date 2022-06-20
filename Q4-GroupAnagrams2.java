//TC: O(N*K) where N is nunber of strings in strs array and K is max length of string
//SC: O(N*K) where N is nunber of strings in strs array and K is max length of string

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> map = new HashMap<>();
        for(String str : strs) {
            char[] c = str.toCharArray();
            int[] count = new int[26];
            for(char ch : c) {
                count[ch - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < 26; i++) {
                sb.append(count[i]);
                sb.append('*');
            }
            String key = sb.toString();
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList(map.values());
    }
}