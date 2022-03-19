public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement longestRepeatingCharacterReplacement = new LongestRepeatingCharacterReplacement();
        String s = "";
        int k = 0;
        System.out.println(longestRepeatingCharacterReplacement.characterReplacement(s, k));
    }

    public int characterReplacement(String s, int k) {
        if (s.isEmpty()) {
            return 0;
        }
        int l = 0, r = 0;
        int[] freq = new int[26];
        int maxFreq = 0;
        freq[s.charAt(l) - 'A']++;
        while (r < s.length() - 1) {
            r++;
            freq[s.charAt(r) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(r) - 'A']);
            if ((r - l + 1 - maxFreq) > k) {
                freq[s.charAt(l) - 'A']--;
                l++;
            }
        }
        return r - l + 1;
    }
}
