<<<<<<< HEAD
import java.util.Scanner;

// Check valid age for voting
public class function_p03 {
    static int age;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        age = sc.nextInt();

        check_age();
    }

    static void check_age(){
        if(age >= 18 ){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
    }
=======
import java.util.Scanner;

// Check valid age for voting
public class function_p03 {
    static int age;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        age = sc.nextInt();

        check_age();
    }

    static void check_age(){
        if(age >= 18 ){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
    }
>>>>>>> b93e3a3e1d55f550b50eae113b1980b2faa60357
}