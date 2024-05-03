import java.util.Scanner;

public class loginexception extends Exception
{
    public loginexception(String s)
    {
        super(s);
    }
}
public class authentication 
{

    public static void main(String[] args)
 {
        String username = "Karthika";
        String password = "karthika123";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Username");
        String u1 = s.nextLine();
        System.out.println("Enter the Password");
        String u2 = s.nextLine();
        try
          {
            if ((u1.equals(username)) && (u2.equals(password))) 
            {
                System.out.println("Acess Granted");
            }
            else  
            {
                throw  new loginexception("Invalid Credentials");
            }
        }
        catch (loginexception e)
          {
            System.out.println(e.getMessage());

        }

}
}