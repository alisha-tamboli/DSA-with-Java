import java.util.Stack;

public class Balance {

    public static boolean isBAlanced(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i< str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '{' || ch =='[' || ch == '(') {
                s.push(ch);
            } 
            else if(ch == '}' || ch == ']' || ch == ')') {
                if(s.isEmpty()) {
                    return false;
                }

                char top = s.pop();
                if((ch == '}' && top != '{') || (ch == ']' && top != '[') || (ch == ')' && top != '(')) {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
    public static void main(String[] args) {
        String exp = "{{[[";
        System.out.println("Is Balanced : " + isBAlanced(exp));        
    }
}
