// Calculate Commission Percentage
import java.util.Scanner;

public class inter_p6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Sales price: ");
        int sales_price = in.nextInt();

        System.out.print("Enter commission percentage: ");
        int com_per = in.nextInt();

        System.out.println("Value of Commission is: "+sales_price*com_per/100);
    }
}
