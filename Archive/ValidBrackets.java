import java.util.Stack;

class ValidBrackets {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }

    public static boolean isValid(String s) {
        Stack<Integer> m = new Stack<Integer>();
        Integer tmp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                m.push(1);
            } else if (s.charAt(i) == '{') {
                m.push(2);
            } else if (s.charAt(i) == '[') {
                m.push(3);
            } else if (s.charAt(i) == ')') {
                if (m.empty()) {
                    return false;
                }
                tmp = m.pop();
                if (tmp != 1) {
                    return false;
                }
            } else if (s.charAt(i) == '}') {
                if (m.empty()) {
                    return false;
                }
                tmp = m.pop();
                if (tmp != 2) {
                    return false;
                }
            } else if (s.charAt(i) == ']') {
                if (m.empty()) {
                    return false;
                }
                tmp = m.pop();
                if (tmp != 3) {
                    return false;
                }
            }
        }
        if (m.empty()) {
            return true;
        } else {
            return false;
        }
    }
}