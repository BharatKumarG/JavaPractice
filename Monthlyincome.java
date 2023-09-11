import java.util.Scanner;
public class Monthlyincome {
  
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        /*


                This Code IS The Scanner utilization And scanning float data


        
         */
        System.out.println("What is Your Income:  \n");
        float yourincome = scan.nextFloat();
        System.out.println("What is Your Father Income:  \n");
        float yourfatherincome = scan.nextFloat();
        System.out.println("What is Your Mother Income:  \n");
        float yourmotherincome = scan.nextFloat();
        System.out.println("What is Your Sister Income:  \n");
        float yoursisteincome = scan.nextFloat();
        scan.close();

        System.out.printf("Your Income Is %f,\n",yourincome);
        System.out.printf("Your Father Income Is %f,\n",yourfatherincome);
        System.out.printf("Your Income Is %f,\n",yourmotherincome);
        System.out.printf("Your Income Is %f,\n",yoursisteincome);

    }
}
