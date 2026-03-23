import java.util.* ;
public class Queue_Using_Array
{
    int SIZE = 5;
    int Front = -1;
    int Rear = -1;
    int[] arr = new int[SIZE];
    
    public void Enqueue(int data)
    {
        if (Rear == SIZE-1)
        {
            System.out.println("Queue is Overflowing");
        }
        else if(Front==-1 && Rear==-1)
        {
            Front = 0;
            Rear = 0;
            arr[Rear] = data;
            System.out.println(data+" is Enqueued into the Queue.");
        }
        else 
        {
            arr[++Rear] = data;
            System.out.println(data+" is Enqueued into the Queue.");
        }
    }
    public void Dequeue()
    {
        if(Front==-1 && Rear==-1)
        {
            System.out.println("Queue is Underflow");
        }
        else if (Front==Rear)
        {
            System.out.println(arr[Front]+" is Dequeued From the Queue.");
            arr[Front] = 0;
            Front = -1;
            Rear = -1;
        }
        else 
        {
            System.out.println(arr[Front]+" is Dequeued From the Queue.");
            arr[Front++] = 0;
        }
    }
    public void PEEK()
    {
        if(Front==-1 && Rear==-1)
        {
            System.out.println("Queue is Empty");
        }
        else 
        {
            System.out.println(arr[Front]+" is at the Front of Queue");
        }
    }
    public void Display()
    {
        if(Front==-1 && Rear==-1)
        {
            System.out.println("Queue is Empty");
        }
        else 
        {
            System.out.print("Queue ==> ");
            for(int i=Front;i<=Rear;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    
	public static void main(String[] args) 
	{
	    Queue_Using_Array q = new Queue_Using_Array();
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("*********** WELCOME ***********");
		System.out.println("Enter 1 to Enqueue an Element into Queue. ");
		System.out.println("Enter 2 to Dequeue an Element from Queue. ");
		System.out.println("Enter 3 to PEEK into Queue. ");
		System.out.println("Enter 4 to Display Queue. ");
		System.out.println("Enter -1 to EXIT");
		
		int ip,data;
		while(true)
		{
		    System.out.print("\nEnter Your Choice : - ");
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