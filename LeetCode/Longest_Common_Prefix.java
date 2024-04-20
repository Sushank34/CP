import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Longest_Common_Prefix {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            String result="";
            Arrays.sort(strs);
            int strsLength = strs.length;
            for (int i=0; i<Math.min(strs[0].length(), strs[strsLength-1].length()); i++) {
                if (strs[0].charAt(i)!=strs[strsLength-1].charAt(i)) {
                    return result;
                }
                result = result + strs[0].charAt(i);
            }
            return result;
        }
    }
}
