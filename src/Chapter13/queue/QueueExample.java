package Chapter13.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Member> queue = new LinkedList<>();
        queue.offer(new Member("1. 김건혁"));
        queue.offer(new Member("2. 김태윤"));
        queue.offer(new Member("3. 임종률"));
        queue.offer(new Member("4. 박진성"));

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println("- - - - - -");

        Stack<String> stack = new Stack<>();
        stack.push("김태윤");
        stack.push("박진성");
        stack.push("임종률");
        stack.push("김건혁");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
        }
    }
}
