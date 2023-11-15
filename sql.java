import java.util.Scanner;
public class sql {
    public static void main (String[] args){
        String Pass = "1";
        String usernameString = "k";
        int chance = 2;

         if(chance <= 0){
            System.out.println("Access Denied");
            Pass = null;

        }
        
        while(chance > 0){
        System.out.println("Login... ");
        Scanner Scanner1 = new Scanner(System.in);
        System.out.println("Username: ");
        String userInput1 = Scanner1.nextLine();
        // System.out.println("Password:");
        // String userPass = Scanner1.nextLine();
        // System.out.println(userName);
        // System.out.println(userPass);
        }
        String User1 = usernameString;
        System.out.println(User1);
        if(userInput1 == usernameString){
                System.out.println("ok");
            }
    }
}
