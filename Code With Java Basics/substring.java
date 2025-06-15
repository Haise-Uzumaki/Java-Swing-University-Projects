import java.util.Scanner;

public class substring {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            String username;
            String email;
            String domain;


            System.out.print("Enter Your Email : ");
            email = scanner.nextLine();
            
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@")+1);

            System.out.println(username);

            System.out.println(domain);

            scanner.close();
    }
}
