import java.util.ArrayList;

public class StackByArrayList {

    static class Stack {
       static ArrayList<Integer> list = new ArrayList<>();

    public static boolean isEmpty() {
        return list.size() == 0;
    }

    public static void push(int data) {
        list.add(data);
    }

    public static int pop() {
        if(isEmpty()) {
            return -1;
        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }

    public static int peek() {
        if(isEmpty()) {
            return -1;
        }
        return list.get(list.size()-1);
    }

    }
    public static void main(String[] args) {
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            s.peek();
            System.err.println(s.pop());  
        }
    }
}

//using java collection framework
//Satck<Integer> s = new Satck<>();
//push(), pop(), peek(), isEmpty() all functions are present in JAVA COLLECTION framework