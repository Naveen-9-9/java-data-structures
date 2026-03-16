import java.io.*;

public class Problem_16 {
    public static void show(String FileName) throws IOException{
        try{
            FileReader fr = new FileReader("name.txt");
        }catch(FileNotFoundException e){
            System.out.println("file Not Found");
        }
    }
    public static void main(String[] args) throws IOException {
        show("name.txt");
    }
}
