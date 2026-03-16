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
public class CircularDoublyLinkedList {
    Node Head;
    CircularDoublyLinkedList(){
        this.Head = null;                                                                  //2
    }
    public void InsertAtEnd(int data){
        Node newNode = new Node(data);
        if (this.Head == null){
            this.Head = newNode;                                          //3
        }
        else{
            Node temp = this.Head;
            while (temp.next != this.Head) {
                temp=temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
        newNode.next = this.Head;
    }
    public void InsertAtBegin(int data){
        Node newNode = new Node(data);
        if (this.Head == null){
            this.Head = newNode;
        }                                                                                 //5
        else{
            Node temp = this.Head;
            newNode.next = temp;
            temp = newNode;
            newNode.prev = temp;
        }
        newNode.next = this.Head;
    }
    public void InsertAtPostion(int data ,  int pos ){
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
            newNode.prev = temp;
            if (temp.next != this.Head) {
                temp.next = newNode;
            }
            temp.next = newNode;
            temp.prev = temp;
            // newNode.next = temp.next;
            // newNode.prev = temp;
            // temp.next = newNode;
        }
        newNode.next = this.Head;
    }
    public void DeleteAtEnd(){
        if (this.Head == null) {
            System.out.println("the List is empty");
        }else if(this.Head.next == null){
            this.Head = null;
        }else{
            Node temp = this.Head;
            while (temp.next.next != this.Head) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }
    public void DeleteAtBegin(){
        // this.Head = null;
        if (this.Head == null) {
            System.out.println("the List is empty");
        }else{
            this.Head = this.Head.next;
            this.Head.prev = null;
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
            temp.next.prev = temp;
        }
    }
    public void Display(){
        Node temp = this.Head;
        while (temp.next != this.Head) {
            System.out.println(temp.prev + " "+temp +" "+temp.data + " " + temp.next);       // 4 
            // System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.prev + " "+temp +" "+temp.data + " " + temp.next);
    }
    public static void main(String[] args) {
        CircularDoublyLinkedList List = new CircularDoublyLinkedList();
        List.InsertAtEnd(1);
        List.InsertAtEnd(2);
        List.InsertAtEnd(3);
        List.InsertAtEnd(4);
        // List.InsertAtBegin(1);
        // List.InsertAtBegin(2);
        // List.InsertAtBegin(3);
        // List.InsertAtBegin(2);
        // List.InsertAtPostion(7,3);
        // List.Display();
        System.out.println();
        // List.DeleteAtBegin();
        // List.DeleteAtEnd();
        // List.DeleteAtPostion(2);
        List.Display();
    }
}