
/**
 * <a href="https://leetcode.com/problems/palindrome-number/">Problem link</a>
 * **/

public class Palindrome_Number {
    class Solution {
        public boolean isPalindrome(int x) {
            int reverse_x = 0, temp_x = x;
            while(temp_x > 0) {
                reverse_x = (reverse_x * 10) + (temp_x % 10);
                temp_x = temp_x / 10;
            }
            return x == reverse_x;
        }
    }
}
