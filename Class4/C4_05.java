class IncorrectPasswordException extends RuntimeException{
    IncorrectPasswordException(String msg){
        super(msg);
    }
}

public class C4_05 {
    public static void CheckPassword(String epwd)throws IncorrectPasswordException{
        String opwd ="123456789";

        if (epwd.equals(opwd)) {
            System.err.println("Login Sucessfully");
        }
        else  {
            throw new IncorrectPasswordException("Worng Password");
        }
    }
    public static void main(String[] args) {
        try {
            CheckPassword("12345678");
        } catch (IncorrectPasswordException e) {
            System.out.println(e.getMessage()); 
            System.err.println("Please Enter The correct Password");
            CheckPassword("123456789");
        }
    }
}
