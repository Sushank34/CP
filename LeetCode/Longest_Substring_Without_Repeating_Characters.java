import java.util.HashSet;

/**
 * <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters">Problem link</a>
 * **/

public class Longest_Substring_Without_Repeating_Characters {

    class Solution {
        public int lengthOfLongestSubstring(String s) {
            HashSet<Character> hashset = new HashSet<>();
            int i = 0, result = 0;
            char c;
            for (int j = 0; j < s.length(); j++) {
                c = s.charAt(j);
                while (hashset.contains(c)) {
                    hashset.remove(s.charAt(i));
                    i++;
                }
                hashset.add(c);
                result = Math.max(result, j - i + 1);
            }
            return result;
        }
    }
}
