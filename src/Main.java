/*
Author : R.White
Date: 25.03.19
Project: Queues implemented via Linked List.
 */
public class Main {
    public static void main (String args []){
        Queue myQueue = new Queue();

        myQueue.enqueue(10);
        myQueue.enqueue(11);
        myQueue.enqueue(12);
        myQueue.enqueue(13);

        myQueue.displayQueue();

        System.out.println("getFront: "+myQueue.getFront());

        System.out.println("removing: "+myQueue.dequeue());
        myQueue.displayQueue();

        myQueue.deleteQueue();
        myQueue.displayQueue();
    }
}
