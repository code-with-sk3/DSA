import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s2.length() < s1.length()) return false;

        int[] freq = new int[26];
        int[] wind = new int[26];

        // Count characters in s1 and first window of s2
        for(int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            wind[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(freq, wind)) return true;

        // Slide the window
        for(int i = s1.length(); i < s2.length(); i++) {

            // Add the new character
            wind[s2.charAt(i) - 'a']++;

            // Remove the character leaving the window
            wind[s2.charAt(i - s1.length()) - 'a']--;

            if(Arrays.equals(freq, wind)) return true;
        }

        return false;
    }
}