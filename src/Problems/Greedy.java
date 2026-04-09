package Problems;

import java.util.HashSet;

public class Greedy {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int length = 0;

        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                set.remove(c);
                length += 2; // pair found
            } else {
                set.add(c);
            }
        }

        // if any character left, we can place one in center
        if (!set.isEmpty()) {
            length += 1;
        }

        return length;
    }
}
