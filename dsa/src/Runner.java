public class Runner {

    public static void main(String[] args) {

        QueueExample queueExample = new QueueExample();
        queueExample.enqueue(10);
        queueExample.enqueue(20);
        queueExample.enqueue(30);

        queueExample.display();
        queueExample.dequeue();
        queueExample.display();
    }
}
