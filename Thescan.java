import java.util.Scanner;

public class Thescan {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name : "); 
        String name = scanner.nextLine();
        System.out.println("What is Your Age : ");
        int age = scanner.nextInt();
        System.out.println("Please Enter Your Address : "); 
        String add = scanner.nextLine();
        System.out.println("Enter Your City Name : "); 
        String city = scanner.nextLine();


        System.out.printf("Your Good Name Is %s\n",name);
        System.out.printf("Your Age Is %s\n",age);
        System.out.printf("Your Address Is %s\n",add);
        System.out.printf("Your City %s\n",city);
        
        

        
    }
}
