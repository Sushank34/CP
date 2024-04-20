import java.util.HashMap;
import java.util.Map;

public class Roman_to_Integer {
    class Solution {
        static Map<Character, Integer> romanMap = new HashMap<>();
        static {
            romanMap.put('I', 1);
            romanMap.put('V', 5);
            romanMap.put('X', 10);
            romanMap.put('L', 50);
            romanMap.put('C', 100);
            romanMap.put('D', 500);
            romanMap.put('M', 1000);
        }
        public int romanToInt(String s) {
            int result=0, temp=0;
            for (int i=s.length()-1 ; i>=0; i--) {
                if (temp<=romanMap.get(s.charAt(i))) {
                    result = result + romanMap.get(s.charAt(i));
                    temp = romanMap.get(s.charAt(i));
                } else {
                    result = result - romanMap.get(s.charAt(i));
                }
            }
            return result;
        }
    }
}
