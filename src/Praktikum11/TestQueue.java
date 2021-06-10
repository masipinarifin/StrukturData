package Praktikum11;

/**
 *
 * NURUL ARIFIN 19MI0016
 * 
 */

public class TestQueue {

    public static void main(String[] args) {
        LinkedQueue<String> queue = new LinkedQueue<String>();
        System.out.println(queue.isEmpty());
        queue.push("Java");
        queue.push("DotNet");
        queue.push("PHP");
        queue.push("HTML");
        System.out.println("remove: " + queue.pop());
        System.out.println("peek: " + queue.peek());
        System.out.println("size: " + queue.size());
    }
}
