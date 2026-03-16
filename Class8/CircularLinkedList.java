class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;                                                                   //1
        this.next = null;
    }
}
public class CircularLinkedList {
    Node Head;
    CircularLinkedList(){
        this.Head = null;                                                                  //2
    }
    public void InsertAtEnd(int data){
        Node newNode = new Node(data);
        if (this.Head == null){
            this.Head = newNode;                                                      //3
        }
        else{
            Node temp = this.Head;
            while (temp.next != this.Head) {
                temp=temp.next;
            }
            temp.next = newNode;
        }
        newNode.next = this.Head;
    }
    public void InsertAtBegin(int data){
        Node newNode = new Node(data);
        if (this.Head == null){
            this.Head = newNode;
        }                                                                               //5
        else{
            newNode.next = this.Head;
            this.Head = newNode;
        }
        newNode.next = this.Head;
    }
    public void InsertAtPostion(int data ,  int pos){
        Node newNode = new Node(data);
        if (pos == 1) {
            newNode.next = this.Head;
            this.Head = newNode;
        }
        else{
            Node temp = this.Head;
            while (pos - 2 > 0 && temp.next != null) {                                  //6
                temp = temp.next;
                pos--;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        newNode.next = this.Head;
    }
    public void DeleteAtEnd(){
        if (this.Head == null) {
            System.out.println("the list is empty");
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
    public void DeleteAtBegin(){
        // this.Head = null;
        if (this.Head == null) {
            System.out.println("the list is empty");
        }else{
            this.Head = this.Head.next;
        }
    }
    public void DeleteAtPostion(int pos){
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
        }
    }
    
    public void Display(){
        Node temp = this.Head;
        while (temp.next != this.Head) {
            // System.out.println(temp.data);                                              // 4
            System.out.println(temp +" "+temp.data + " " + temp.next);
            temp = temp.next;
        }
        System.out.println(temp +" "+temp.data + " " + temp.next);   
    }
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.InsertAtEnd(1);
        list.InsertAtEnd(2);
        list.InsertAtEnd(3);
        list.InsertAtEnd(4);
        // list.InsertAtEnd(4);
        // list.InsertAtBegin(5);
        // list.Display();System.out.println();
        // list.InsertAtPostion(6, 6);
        // list.DeleteAtEnd();
        // list.DeleteAtPostion(3);
        list.Display();
    }
}
