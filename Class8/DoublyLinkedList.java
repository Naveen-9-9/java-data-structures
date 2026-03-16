import java.util.Scanner;

class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
        this.prev = null;                                                                  //1
        this.next = null;
    }
}
public class DoublyLinkedList {
    Node Head;
    DoublyLinkedList(){
        this.Head = null;                                                                  //2
    }
    public void Insert_At_End(int data){
        Node newNode = new Node(data);
        if (this.Head == null){
            this.Head = newNode;                                                           //3
        }
        else{
            Node temp = this.Head;
            while (temp.next != null) {
                temp=temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }
    public void Insert_At_Begin(int data){
        Node newNode = new Node(data);
        if (this.Head == null){
            this.Head = newNode;
        }                                                                                   //5
        else{
            Node temp = this.Head;
            newNode.next = temp;
            temp = newNode;
            newNode.prev = temp;
        }
    }
    public void Insert_At_Position(int data ,  int pos ){
        Node newNode = new Node(data);
        if (pos == 1) {
            newNode.next = this.Head;
            this.Head = newNode;
        }
        else{
            Node temp = this.Head;
            while (pos - 2 > 0 && temp.next != null) {                                      //6
                temp = temp.next;
                pos--;
            }
            // newNode.next = temp.next;
            // newNode.prev = temp;
            // if (temp.next != null) {
            //     temp.next = newNode;
            // }
            // temp.next = newNode;
            // // temp.prev = temp;
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next = newNode;
        }
    }
    public void Delete_At_End(){
        if (this.Head == null) {
            System.out.println("the dll is empty");
        }else if(this.Head.next == null){
            this.Head = null;
        }else{
            Node temp = this.Head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }
    public void Delete_At_Begin(){
        // this.Head = null;
        if (this.Head == null) {
            System.out.println("the dll is empty");
        }else{
            this.Head = this.Head.next;
            this.Head.prev = null;
        }
    }
    public void Delete_At_Position(int pos){
        if (pos == 1){
            this.Head = this.Head.next;
        }
        else{
            Node temp = this.Head;
            while (pos - 2 > 0 && temp.next != null) {
                temp = temp.next;
                pos--;

            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
        }
    }
    public void Display(){
        Node temp = this.Head;
        while (temp != null) {
            System.out.println(temp.prev + " "+temp +" "+temp.data + " " + temp.next);       // 4 
            // System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args)
	{
		DoublyLinkedList dll = new DoublyLinkedList();
		Scanner sc = new Scanner(System.in);

		System.out.println("**************** WELCOME ****************");
		System.out.println("Enter 1 to Insert Element at End.  ");
		System.out.println("Enter 2 to Insert Element at Begining. ");
		System.out.println("Enter 3 to Insert Element at Position. ");
		System.out.println("Enter 4 to Delete Element at End. ");
		System.out.println("Enter 5 to Delete Element at Begining. ");
		System.out.println("Enter 6 to Delete Element at Position. ");
		System.out.println("Enter 7 to Display the LinledList. ");
		System.out.println("Enter -1 to EXIT. ");

		int data, ip, pos ;

		while(true)
		{
			System.out.print("Enter Input :- ");
			ip = sc.nextInt();
			
			if (ip == 1)
			{
				System.out.print("Enter value to Insert at End :- ");
				data = sc.nextInt();
				dll.Insert_At_End(data);
				System.out.println(data+" Inserted at End");
			}
			else if (ip == 2)
			{
				System.out.print("Enter value to Insert at Begining :- ");
				data = sc.nextInt();
				dll.Insert_At_Begin(data);
				System.out.println(data+" Inserted at Begining");
			}
			else if (ip == 3)
			{
				System.out.print("Enter value and Position to Insert :- ");
				data = sc.nextInt();
				pos = sc.nextInt();
				dll.Insert_At_Position(data, pos);
				System.out.println(data+" Inserted at "+pos+" Position");
			}
			else if (ip == 4)
			{
				dll.Delete_At_End();
				System.out.println("value Deleted at End");
			}
			else if (ip == 5)
			{
				dll.Delete_At_Begin();
				System.out.println("value Deleted at Begin");
			}
			else if (ip == 6)
			{
				System.out.print("Enter Position to Delete :- ");
				pos = sc.nextInt();
				dll.Delete_At_Position(pos);
				System.out.println("value Deleted at "+pos+" Position");
			}
			else if (ip == 7)
			{
			    System.out.println("The LinkedList is --- ");
				dll.Display();
				break;
			}
			else if (ip == -1)
			{
				System.out.println("Program EXIT");
				break;
			}	
		}
	}
}