class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;                                                                   //1
        this.next = null;
    }
}
public class LinkedList {
    Node front;
    LinkedList(){
        this.front = null;                                                                  //2
    }
    public void InsertAtEnd(int data){
        Node newNode = new Node(data);
        if (this.front == null){
            this.front = newNode;                                                          //3
        }
        else{
            Node temp = this.front;
            while (temp.next != null) {
                temp=temp.next;
            }
            temp.next = newNode;
        }
    }
    public void InsertAtBegin(int data){
        Node newNode = new Node(data);
        if (this.front == null){
            this.front = newNode;
        }                                                                               //5
        else{
            newNode.next = this.front;
            this.front = newNode;
        }
    }
    public void InsertAtPostion(int data ,  int pos ){
        Node newNode = new Node(data);
        if (pos == 1) {
            newNode.next = this.front;
            this.front = newNode;
        }
        else{
            Node temp = this.front;
            while (pos - 2 > 0 && temp.next != null) {                                  //6
                temp = temp.next;
                pos--;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            
        }
    }
    public void DeleteAtEnd(){
        if (this.front == null) {
            System.out.println("the list is empty");
        }else if(this.front.next == null){
            this.front = null;
        }else{
            Node temp = this.front;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }
    public void DeleteAtBegin(){
        // this.front = null;
        if (this.front == null) {
            System.out.println("the list is empty");
        }else{
            this.front = this.front.next;
        }
    }
    public void DeleteAtPostion(int pos){
        if (pos == 1){
            this.front = this.front.next;
        }
        else{
            Node temp = this.front;
            while (pos - 2 > 0 && temp.next != null) {
                temp = temp.next;
                pos--;

            }
            temp.next = temp.next.next;
        }
    }
    public void Display(){
        if(front == null){
            System.out.println("the list is empty");
            return;
        }
        Node temp = this.front;
        while (temp != null) {
            System.out.print(temp.data+" ");                                              // 4
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.InsertAtEnd(1);
        list.InsertAtEnd(2);
        list.InsertAtEnd(3);
        list.InsertAtEnd(4);
        list.InsertAtBegin(5);
        list.Display();System.out.println();
        list.InsertAtPostion(6, 6);
        // list.DeleteAtEnd();
        list.DeleteAtPostion(3);
        list.Display();
    }
}

/*public void insatend(int data){
    Node newNOde = new Node(data);
    if (this.front == null){
        this.front = newNode;
        }
    else{
        Node temp = this.front;
    while( temp.next != null){
        temp = temp.next;
    }
    temp.next = newNode;
    }
} 
    
public void InsAtbegin(int data){
    Node newNode = new Node(data);
    if (this.front == null){
    this.front = newNode;
}
    else {
        newNode.next = this.front;
    this.front = newNode;
}
}

public void InAtpos(int data, int pos){
    Node newNode = new Node(data);
    if(pos == 1){
    newNode.next = this.front;
    this.front = newNode;
    }
    else {
        Node temp = this.front;
        while(pos - 2 > 0 && temp.next != null ){
        temp = temp.next;
        }
        newNode.next = temp.front ;
        temp.front = newNode;
    }

public void deleteatend(){
    if ( this.front == null){
        System.out.println("list is empty")
    }else if (this.front.next == null){
        this.front = null
    }else {
        node temp = this.front;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }
}
public void deleteatbegin(){
    if(this.front == null){
    sysout("empty");
    }
    else{
        this.front = this.front.next;    
    }
}
public void deleteatpos(int pos ){
    if(pos == 1){
    this.front = this.front.next;
    }
    else{
        Node temp = this.front;
        while( pos - 2 > 0 && temp.next != null){
        temp = temp.next;
        pos--;
        }   
        temp.next = temp.next.next;
    }    
}
    */
