public interface QueueInterface <T> {

    //adds a new entry to the back of the QUEUE.
    public void enqueue(T newEntry);


    /*
    removes and returns the entry at the front of the queue.
    if the queue is empty it returns null.
     */
    public T degueue();


    /*
    retrieves the entry at the front of the queue, without
    altering the queue, like a stack peek().
     */
    public T getFront();


    //detects if this queue is empty
    public boolean isEmpty();


    //removes all entries from the queue.
    public void clear();
}
