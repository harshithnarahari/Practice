//TC: O(N) where N is size of string
//SC: O(1) because size of characters in constant and we're given that string only contains lower case letters
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        Map<Character, Integer> map = new HashMap<>();
        //Map<Character, Integer> tMap = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }
        
        //checking only the t String because i'm decrementing only on parsing t String and if there were a - ve it would be only when: there exists a new character in t not in s || there are more/new occuraces of a character in t than in s --> so i only iterate through t String and return.
        for(int i = 0; i < s.length(); i++) {
            if(map.get(t.charAt(i)) != 0) return false;
        }
        
        return true;
    }
}