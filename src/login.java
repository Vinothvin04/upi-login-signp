import java.util.Objects;
import java.util.Scanner;

public class login {


    public void login_method(){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello User!");
        System.out.println("press 1 for login");

        System.out.println("press 2 for signup");
        int login_n = input.nextInt();

        if (login_n==1){
            int phone=1234567890;
            int password=123456;
            System.out.println("enter your phone number!");
            int login_n1= Integer.parseInt(input.next());
            System.out.println("enter your 6 digit PIN");
            int login_n2= input.nextInt();

            if (login_n1==phone && login_n2==password){
                System.out.println("Login Success");
            }else {
                System.out.println("Incorrect email or password");

            }
        }if (login_n==2){
            System.out.println("Enter the phone number");
            int login_n2= input.nextInt();
            System.out.println("Set 6 digit Security PIN");
            int login_n5= input.nextInt();
            System.out.println("Enter the account number");
            int login_n3= input.nextInt();
            System.out.println("Enter the card last 4 digit");
            int login_n4= input.nextInt();
            System.out.println("Saved");
        }





    }
}
