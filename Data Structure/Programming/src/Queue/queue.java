package Queue;

import java.util.Stack;

public class queue {
    Stack<Integer> og;
    Stack<Integer> tmp;
    public queue() {
        og = new Stack<Integer>();
        tmp = new Stack<Integer>();
    }

    public void push(int x) {
        og.push(x);
    }

    public int pop() {
        int result;
        while (og.size() != 0) {
            tmp.push(og.pop());
        }
        result = tmp.pop();
        while (tmp.size() != 0) {
            og.push(tmp.pop());
        }
        return (result);
    }

    public int peek() {
        int result;
        while (og.size() != 0) {
            tmp.push(og.pop());
        }
        result = tmp.peek();
        while (tmp.size() != 0) {
            og.push(tmp.pop());
        }
        return (result);
    }

    public boolean empty() {
        if (og.size() == 0)
            return (true);
        else
            return (false);
    }
}
