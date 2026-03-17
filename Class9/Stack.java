import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Stack {
    Node Stack;
    int size = 3 ;
    int count = 0;
    Stack(){
        this.Stack = null;
    }
    public void push(int data){
        if (this.IsFull()){
            System.out.println("Stack OVERFLOW");
        }
        else{
            Node newNode = new Node(data);
            newNode.next = this.Stack;
            this.Stack = newNode;
            count++;
            System.out.println("The element PUSHED into STACK ");
        }
    }
    public void pop(){
        // this.Stack = null;
        if (this.IsEmpty()) {
            System.out.println("the stk is empty");
        }else{
            System.out.println(Stack.data+ " " + "Got POPPED from the stack");
            this.Stack = this.Stack.next;
            count--;
        }
    }
    public void Peek(){
        if (this.IsEmpty()) {
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("The PEEK of the Stack : " + this.Stack.data);
        }
    }
    public boolean IsEmpty(){
        if (count == 0) {
            return true;
        }   
        else{
            return false;
        }
    }
    public boolean IsFull(){
        if (count == size) {
            return true;
        }
        else{
            return false;
        }
    }
    public void Display(){
        Node temp = this.Stack;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Stack stk = new Stack();
        Scanner sc = new Scanner(System.in);
        System.out.println("********** WELCOME TO STACK ***********");
        System.out.println("Enter 1 to PUSH into STACK");
        System.out.println("Enter 2 to POP from STACK");        
        System.out.println("Enter 3 to PEEK the STACK");
        System.out.println("Enter 4 to DISPLAY the stack ");
        System.out.println("Enter -1 to EXIT the Program"); 
        
        int ip , data ;

        while (true) {
            System.out.print("Enter your Choice : -");
            ip = sc.nextInt();
            
            if(ip == 1){
                System.out.println("Enter the element to PUSH");
                data = sc.nextInt();
                stk.push(data);
            }
            else if (ip == 2){
                stk.pop();
            }
            else if (ip == 3){
                stk.Peek();
            }
            else if (ip == 4){
                stk.Display();
            }
            else if (ip == -1){
                System.out.println("EXITED");
                break;
            }
        }
    }
}
