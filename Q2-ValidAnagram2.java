class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        int[] freq = new int[26];// because we know that there can be only 26 lower case english letters
        
        //iterating through both Strings by this point we're sure that both Strings are of same length
        for(int i = 0; i < s.length(); i++) {
            //this will get me the position of character, we have 26 slots for 26 characters
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        
        for(int count : freq) {
            //we are doing != 0 because for an anagram every ++ and -- must cancel out and there musst be a zero finally, also we know that in a int array by default it's contents are zero
            if(count != 0) {
                return false;
            }
        }
        return true;
    }
}