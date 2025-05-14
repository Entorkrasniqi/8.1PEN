public class PalindromeChecker {
    public boolean isPalindrome(String str) {
        if (str == null) return false;

        // Normalize the string: remove non-alphanumeric characters and lowercase it
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
