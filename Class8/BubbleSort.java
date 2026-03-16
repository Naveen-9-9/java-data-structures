import java.util.*;
public class BubbleSort
{
    public static void Bubble_Sort(int[]arr)
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            boolean flag=true;
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    flag=false;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(flag==true)
                return; 
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Bubble_Sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}