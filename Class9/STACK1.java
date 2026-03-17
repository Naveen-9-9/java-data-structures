import java.util.*;

public class STACK1
{
    int stack[];
    int top;
    int size = 5;
    
    STACK1(){
        stack = new int[size];
        top = -1;
    }

    public void push(int data)
    {
        if(top == size - 1){
            System.out.println("Stack is Overflow");
            return;
        }
        top++;
        stack[top] = data;
    }

    public void pop()
    {
        if(top == -1){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println(stack[top] + " was deleted from the Stack");
        top--;
    }
    
    public void PEEK()
    {
        if(top == -1){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println(stack[top] + " was top element in the Stack");
    }

    public void Display()
    {
        if(top == -1){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Stack: ");
        for(int i = top; i >= 0; i--){
            System.out.println("| " + stack[i] + " |");
        }
    }

    public static void main(String[] args)
    {
        STACK1 s = new STACK1();
        Scanner sc = new Scanner(System.in);

        System.out.println("*********** WELCOME ***********");
        System.out.println("Enter 1 to PUSH an Element into Stack. ");
        System.out.println("Enter 2 to POP an Element from Stack. ");
        System.out.println("Enter 3 to PEEK into Stack. ");
        System.out.println("Enter 4 to Display Stack. ");
        System.out.println("Enter -1 to EXIT");

        int ip,data;

        while(true)
        {
            System.out.print("Enter Your Choice : - ");
            ip = sc.nextInt();

            if(ip == 1)
            {
                System.out.print("Enter data to PUSH into Stack : ");
                data = sc.nextInt();
                s.push(data);
            }
            else if(ip == 2)
            {
                s.pop();
            }
            else if(ip == 3)
            {
                s.PEEK();
            }
            else if(ip == 4)
            {
                s.Display();
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