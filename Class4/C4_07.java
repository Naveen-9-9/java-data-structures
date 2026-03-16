import java.util.Scanner;

class InvalidPasswordException extends RuntimeException{
    InvalidPasswordException(String msg){
        super(msg);
    }
}
class IncorrectPasswordException extends RuntimeException{
    IncorrectPasswordException(String msg){
        super(msg);
    }
}

public class C4_07 {
    public static void CheckPassword(String epwd)throws IncorrectPasswordException{
        String opwd ="123456789";

        if (epwd.equals(opwd)) {
            System.err.println("Login Sucessfully");
        }
        else  {
            throw new IncorrectPasswordException("Worng Password");
        }
    }
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
        
        System.out.println("Password Updated");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true ;


        while (running) {
            System.out.println("1. Create Password");
            System.out.println("2. Login");
            System.out.println("3. Forgot Password");
            System.out.println("4. Exit");
            int Choose = sc.nextInt();

            switch (Choose) {
                case 1:
                        CreatPassword(sc.next());
                    break;
                case 2 :
                    CheckPassword(sc.next());
                    break;
                case 3 :
                    System.out.println("Create a new password");
                    String Forgot = sc.next();
                    CreatPassword(Forgot);
                break;
                case 4:
                    running = false;
                    break;
                default:
                    break;
            }
        }

    }
}

