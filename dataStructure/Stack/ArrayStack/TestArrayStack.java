package dataStructure.Stack.ArrayStack;

public class TestArrayStack {
    public static void main(String[] args) {
        ArrayStack<String> stack = new ArrayStack<>(5);

        try {
            stack.push("A");
            stack.push("2");
            stack.push("3");
            stack.push("4");
            stack.push("5");
            //stack.push(6);
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.peek();
            //stack.push(6);
            //stack.push(10);
            System.out.println(stack.peek());
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
