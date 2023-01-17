import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
      Stack<Integer> old= new Stack<>();
      old.push(1);
        old.push(3);
        old.push(4);
        old.push(5);
        for(int i:old){
          System.out.println(i);
       }
        Stack<Integer> news;
        news=copyStack(old);
        for(int i:news){
            System.out.println(i);
        }

    }
    public static Stack<Integer> copyStack(Stack<Integer> stack) {
        Stack<Integer> newStack = new Stack<>();
        Queue<Integer> tempQueue = new LinkedList<>();
        while (!stack.isEmpty()) {
            tempQueue.add(stack.pop());
        }
        while (!tempQueue.isEmpty()) {
            newStack.push(((LinkedList<Integer>) tempQueue).pollLast());
        }

        // Возвращаем исходный стек в исходное состояние
        //while (!newStack.isEmpty()) {
       //     stack.push(newStack.pop());
       // }
        return newStack;
    }
}
