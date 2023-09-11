import java.util.Scanner;

public class Addressscan {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("What is Your Name : "); 
        String name = scan.nextLine();
        System.out.println("What is Your Father Name : "); 
        String fathername = scan.nextLine();
        System.out.println("Enter Your City Name : "); 
        String city = scan.nextLine();
        System.out.println("Your Nick Name IS : ");
        String nickname = scan.nextLine();
        System.out.println("What is Your Age : ");
        int age = scan.nextInt();
        System.out.println("What is your Father Age : ");
        int fatherage = scan.nextInt();
        

        System.out.println("\n");
        System.out.printf("Your Good Name Is %s\n",name);
        System.out.printf("Your Father Good Name Is %s\n",fathername);
        System.out.printf("Your Age Is %s\n",age);
        System.out.printf("Your Father's Age is %s\n",fatherage);
        System.out.printf("Your City %s\n",city);
        System.out.printf("Your Nick Name is %s\n",nickname);
        System.out.println("\n");
        
        
        

        
    }
}
