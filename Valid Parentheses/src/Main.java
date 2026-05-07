import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //String s = "()[]";
        //String s = "(]";
        String s = "([{}])";
        System.out.println(validParentheses(s));
    }

    public static boolean validParentheses(String s) {
        if (s.length() % 2 != 0) return false;

        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()){
            if (ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }
            else {
                if (stack.isEmpty()) return false;
                char open = stack.pop();

                if (open == '(' && ch != ')') return false;
                if (open == '[' && ch != ']') return false;
                if (open == '{' && ch != '}') return false;
            }
        }

        return stack.isEmpty();
    }
}