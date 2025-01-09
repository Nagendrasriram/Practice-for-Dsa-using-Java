//Take name as input and print a greeting message for that particular name.
import java.util.Scanner;
public class Greet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name:");
        String name = sc.nextLine();
        System.out.println("Hello"+name+"!");
        System.out.println("Welcome to java");
    }
    
}
