import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCount.merge(c, 1, Integer::sum);
        }

        for (char c : t.toCharArray()) {
            Integer count = charCount.get(c);
            if (count == null || count == 0) return false;
            charCount.put(c, count - 1);
        }

        return true;
    }
}