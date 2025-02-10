import java.util.Stack;
public class ReverseStr {
    public static void main(String[] args) {
        String str = "hello";

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        StringBuilder sb = new StringBuilder();

        while(!s.isEmpty()) {
            sb.append(s.pop());
        }

        System.out.print(sb.toString());
    }

}