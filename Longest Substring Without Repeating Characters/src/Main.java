import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s = "abcabcbb";

        System.out.println(longestSubstring(s));
    }

    public static int longestSubstring(String s) {
        int left = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            while (set.contains(current)){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(current));
            max = Math.max(max, left);
        }

        return max;
    }
}