package day25;

public class InterfaceImplementationExamle {
    public static void main(String[] args) {
        CircularQueue<String> circularQueue= new CircularQueue<>();
        circularQueue.add("Dipika");
        circularQueue.size();

        LinkedListQueue<String> linkedListQueue= new LinkedListQueue<>();
        linkedListQueue.add("Upadhaya");
        linkedListQueue.size();

        Queue<Integer> circularQueue1= new CircularQueue<>();// Queue is parent class/interface
        circularQueue1.add(1);

        Queue<Integer> linkedListQueue1= new LinkedListQueue<>();
        linkedListQueue1.add(2);
    }
}
