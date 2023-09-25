import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
         String static_username="meronaam";
         String static_password="meropw";
         Scanner sc=new Scanner(System.in);
        System.out.println("You've got 5 chances to enter the correct username and password");
        for(int i=1;i<=6;i++){
            if(i>=1 && i<6){
                System.out.println("Enter the username");
                String entered_username=sc.next();
                System.out.println("Enter the password");
                String entered_password=sc.next();
                if(entered_username.equals(static_username) && entered_password.equals(static_password)){
                    System.out.println("Login successful!");
                    break; //exit the loop
                }
                else {
                    System.out.println("Try again");
                }
            } else if(i==6){
                System.out.println("You have reached your limit to login. Try again later.");
            }

        }

    }
}
