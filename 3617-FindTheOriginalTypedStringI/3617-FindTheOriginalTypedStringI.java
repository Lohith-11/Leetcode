// Last updated: 7/22/2025, 11:45:39 AM
class Solution {
    public int possibleStringCount(String word) {
        int count = 1;
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i)==word.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }
}