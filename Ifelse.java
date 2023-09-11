import java.util.Scanner;
public class Ifelse {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" What is Your Age : ");
        int age = sc.nextInt();
        if(age>=18)
        {
            System.out.println("Your Age is 18 Or Above \n");
        }
        else if(age>=25)
        {
            System.out.println("Your Age is Above 25 or Above ");
        }
        else if(age>=35)
        {
            System.out.println("Your Age is Above 35 or above");
        }
        else if(age>=45)
        {
            System.out.println("Your Age is 45 or Above");
        }
        else
        {
            System.out.println("Your Age Is Below 18 You Are Kid Go Back This Site");
        }
    }
}
