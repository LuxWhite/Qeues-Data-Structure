/*
Author : R.White
Date: 25.03.19
Project: Queues implemented via Linked List.
 */
public class Queue {
    private linkedList listObj;

    public Queue(){
        listObj = new linkedList();
    }

    public void enqueue(int data){
        listObj.enqueue(data);
    }

    public int dequeue(){
        return listObj.dequeue();
    }

    public int getFront(){
        return listObj.getFront();
    }

    public void deleteQueue(){
        listObj.clear();
    }

    public void displayQueue(){
        listObj.display();
    }
}
