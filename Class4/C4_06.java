import java.util.Scanner;

class InvalidPasswordException extends RuntimeException{
    InvalidPasswordException(String msg){
        super(msg);
    }
}

public class C4_06 {
    public static void CreatPassword(String epwd)throws InvalidPasswordException{
        if(epwd == null || epwd.length()<8){
            throw new InvalidPasswordException("low length");
        }
        else if (!epwd.matches(".*[a-z].*")){
            throw new InvalidPasswordException("Small letter missing");
        }
        else if (!epwd.matches(".*[A-Z].*")){
            throw new InvalidPasswordException("Capital letter missing");
        }
        else if (!epwd.matches(".*[0-9].*")){
            throw new InvalidPasswordException("Number missing");
        }
        else if (!epwd.matches(".*[!@#$%^&*()].*")){
            throw new InvalidPasswordException("Special Character missing");
        }

        System.err.println("Password Updated");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String epwd = sc.next();
            CreatPassword(epwd);
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage()); 
        }
    }
}
