public class QueueExample {

    int front = 0;
    int rear = -1;
    int size = 5;

    int[] queue = new int[size];
    void enqueue(int value){

        if(rear == size -1 ){
            System.out.println("Queue Full");
        }
        else{
            rear++;
            queue[rear] = value;
            System.out.println(value + "inserted");
        }
    }
    void dequeue(){
        if(front > rear){
            System.out.println("Queue Empty");
        }
        else{
            System.out.println(queue[front] + "removed");
            front++;
        }
    }

    void display(){
        for(int i = front; i <= rear; i++){
            System.out.println(queue[i]);
        }
    }
}
