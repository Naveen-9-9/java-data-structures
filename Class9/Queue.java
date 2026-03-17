import java.util.* ;
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
public class Queue
{   
    Node Front;
    Node Rear;
    Queue()
    {
        this.Front = null;
        this.Rear = null;
    }
    public void Enqueue(int data)
    {
        Node newnode = new Node(data);
        if (this.Front==null && this.Rear==null)
        {
            this.Front = newnode;
            this.Rear = newnode;
            System.out.println(newnode.data+" was Enqueued to Queue");
        }
        else 
        {
            this.Rear.next = newnode;
            this.Rear = newnode;
            System.out.println(newnode.data+" was Enqueued to Queue");
        }
    }
    public void Dequeue()
    {
        if (this.Front==null && this.Rear==null)
        {
            System.out.println("Queue is Empty");
        }
        else if (this.Front.next == null)
        {
            System.out.println(this.Rear.data+" POPPED from Queue ");
            this.Front = null;
            this.Rear = null;
        }
        else 
        {
            System.out.println(this.Rear.data+" POPPED from Queue ");
            this.Front = this.Front.next;
        }
    }
    public void PEEK()
    {
        if (this.Front==null && this.Rear==null)
        {
            System.out.println("Queue is empty");
        }
        else 
        {
            System.out.println("The Front Element is : "+this.Front.data);
        }
    }
    
    public void Display()
    {
        Node temp=this.Front;
        System.out.print("Queue ====> ");
        while(temp!=null)
        {
            // System.out.println(temp+" "+temp.data+" "+temp.next);
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
	public static void main(String[] args) 
	{
	    Queue q = new Queue();
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("*********** WELCOME ***********");
		System.out.println("Enter 1 to ENQUEUE an Element into Queue. ");
		System.out.println("Enter 2 to DEQUEUE an Element from Queue. ");
		System.out.println("Enter 3 to PEEK into Queue. ");
		System.out.println("Enter 4 to Display Queue. ");
		System.out.println("Enter -1 to EXIT");
		
		int ip,data;
		while(true)
		{
		    System.out.print("Enter Your Choice : - ");
		    ip = sc.nextInt();
		    if(ip==1)
		    {
		        System.out.print("Enter data to Enqueue into Queue : ");
		        data = sc.nextInt();
		        q.Enqueue(data);
		    }
		    else if (ip==2)
		    {
		        q.Dequeue();
		    }
		    else if(ip==3)
		    {
		        q.PEEK();
		    }
		    else if (ip==4)
		    {
		        q.Display();
		    }
		    else if (ip==-1)
		    {
		        System.out.println("PROGRAM EXITED");
		        break;
		    }
		}
	}
}