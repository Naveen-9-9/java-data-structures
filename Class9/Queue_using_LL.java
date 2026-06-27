class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class QueueLinkedList{
    Node front;
    Node rear;

    void enqueue(int data){
        Node newNode = new Node(data);
        if (this.front == null){
            this.front = newNode;
            this.rear = newNode;
        }
        else{
            this.rear.next = newNode;
            this.rear = newNode;
        }
        System.out.println(data + " is added to the Queue");
    }

    void dequeue(){
        if (this.front == null) {
            System.out.println("the list is empty");
            return;
        }
        System.out.println(front.data + " is removed from the Queue");
        front = front.next;
        if (front == null) {
            rear = null;
        }q
    }

    void display(){
        if(front == null){
            System.out.println("the list is empty");
            return;
        }
        Node temp = this.front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class Queue_using_LL {
    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.display();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
    }
}
