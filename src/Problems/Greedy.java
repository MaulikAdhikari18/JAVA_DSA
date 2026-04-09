package Problems;

import java.util.HashSet;

public class Greedy {

    //409. Longest Palindrome
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

    //680. Valid Palindrome 2
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                // Try skipping either left or right character
                return isPalindrome(s, left + 1, right) || 
                       isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }

        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
