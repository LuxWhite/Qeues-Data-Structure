/*
Author : R.White
Date: 25.03.19
Project: Queues implemented via Linked List.
 */
public class linkedList {
    Node front; // front.
    Node rear; // back.
    int size; //size of Queue.

    public linkedList() {
        this.front = null;
        this.rear = null;
        size = 0;
    }

    public boolean isEmpty() { return (size == 0); }

    public void clear(){
        front = null;
        rear = null;
        size = 0;
        System.out.println("Queue deleted");
    }

    public int getSize(){
        return size;
    }

    /*
    to add an entry to the back of the queue we allocate a new node and add it to
    the end of the chain. If the queue (chain) is empty we make both the
    first node (front) & last node (rear) reference the new node.Otherwise the
    last node in the chain and the data field must reference the new node.
     */
    public void enqueue(int data){ // ADDS entry to be BACK.
        Node newNode = rear;
        rear = new Node(data,null);
        if (isEmpty()){
            front = rear;
        }else{
            newNode.next = rear;
        }
        size++;
    }

    /*
    We get the entry at the front by accessing the data
   portion of the first node in the chain.
     */
    public int getFront(){ // RETRIEVES entry at FRONT.
        int front = 0;
        if (!isEmpty())
            front = this.front.getData();
        return front;
    }

    /*
    If the queue (chain) had only one node dequeue would make the chain
    empty by setting the fist node (Head) & last node (Tail) to
    null.
     */
    public int dequeue(){ // REMOVES entry from the FRONT.
       int front = 0;
        if (!isEmpty()){
            front = this.front.getData();
            this.front = this.front.getNext();

            if (this.front == null)
                rear = null;
        }
        return front;
    }

    public Node remove(){
        Node temp = front;
            front = front.next;
        return temp;
    }

    public void display(){
        Node tempNode = front;
        while (tempNode != null){
            tempNode.display();
            tempNode = tempNode.next;
        }
        System.out.println();
    }
}
