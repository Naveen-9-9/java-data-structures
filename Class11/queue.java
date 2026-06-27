class ArrayQueue{
    int[] arr;
    int front,rear,size,capacity;


    ArrayQueue(int capacity){
        this.capacity= capacity;
        arr= new int [capacity];
        front = 0;
        size = 0;
        rear = - 1;
    }

    void enqueue(int value ){
        if(size == capacity){
            System.out.println("Queue is full");
            return;
        }
        rear++;
        arr[rear] = value;
        size++;
        System.out.println(value + " enqueued to queue");
    }

    void dequeue(){
        if(size == 0){
            System.out.println("Queue is empty");
            return;
        }
        int value = arr[front];
        front++;
        size--;
        System.out.println(value + " dequeued from queue");
    }

    void display(){
        if(size == 0){
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for(int i=front; i<front+size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void peek(){
        if(size == 0){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front element is: " + arr[front]);
    }

    boolean isEmpty(){
        return size == 0;
    }
}

public class queue {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.display();
        queue.dequeue();
        queue.display();
        queue.peek();
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}