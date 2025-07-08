package DSA;

import java.util.Stack;

public class StackImplement {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("tiger");
        animals.push("cat");
        animals.push("cow");
        animals.push("lion");

        System.out.println(animals);
        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals.peek());

    }
}
