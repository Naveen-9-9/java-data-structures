import java.util.*;

public class QueueArr
{
    int queue[];
    int front;
    int rear;
    int size = 5;
    
    QueueArr(){
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    public void Enqueue(int data)
    {
        if(front > 0){
            for(int i = front; i <= rear; i++){
                queue[i - front] = queue[i];
            }
            rear = rear - front;
            front = 0;
        }
        if(rear == size - 1){
            System.out.println("Queue is Overflow.");
            return;
        } 
        if(front == -1 && rear == -1){
            front = 0;
            rear = 0;
        }
        else{
            rear++;
        }
        queue[rear] = data;
        System.out.println(data + " was added in the Queue.");
    }

    public void Dequeue()
    {
        if(front == -1 && rear == -1){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println(queue[front] + " was deleted from the Queue.");
        if(front == rear){
            front = -1;
            rear = -1;
        }else{
            front++;
        }
    }
    
    public void PEEK()
    {
        if(front == -1 && rear == -1){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println(queue[front] + " was the peek element in the Queue.");
    }

    public void Display()
    {
        if(front == -1 && rear == -1){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue ===> ");
        for(int i = front; i <= rear; i++){
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        QueueArr q = new QueueArr();
        Scanner sc = new Scanner(System.in);

        System.out.println("*********** WELCOME ***********");
        System.out.println("Enter 1 to ENQUEUE an Element into QueueArr. ");
        System.out.println("Enter 2 to DEQUEUE an Element from QueueArr. ");
        System.out.println("Enter 3 to PEEK into QueueArr. ");
        System.out.println("Enter 4 to Display QueueArr. ");
        System.out.println("Enter -1 to EXIT");

        int ip,data;

        while(true)
        {
            System.out.print("Enter Your Choice : - ");
            ip = sc.nextInt();

            if(ip == 1)
            {
                System.out.print("Enter data to Enqueue into Queue : ");
                data = sc.nextInt();
                q.Enqueue(data);
            }
            else if(ip == 2)
            {
                q.Dequeue();
            }
            else if(ip == 3)
            {
                q.PEEK();
            }
            else if(ip == 4)
            {
                q.Display();
            }
            else if(ip == -1)
            {
                System.out.println("PROGRAM EXITED");
                break;
            }
        }
    }
}

class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}