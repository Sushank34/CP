public class Length_of_Last_Word {
    class Solution {
        public int lengthOfLastWord(String s) {
            String[] arr= s.split(" ");
            return arr[arr.length-1].length();
        }
    }

    class Solution2 {
        public int lengthOfLastWord(String s) {
            int length=0;
            for (int i=s.length()-1;i>=0;i--) {
                if (s.charAt(i)!=' ') {
                    length++;
                } else if (length>0) {
                    return length;
                }
            }
            return length;
        }
    }

    class Solution3 {
        public int lengthOfLastWord(String s) {
            s=s.trim();
            int length=0;
            for (int i=s.length()-1;i>=0;i--) {
                if (s.charAt(i)==' ') {
                    break;
                } else {
                    length++;
                }
            }
            return length;
        }
    }
}
