
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;
public class Simple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        int pri=sc.nextInt();
        
        System.out.print("Enter the time: ");
        int time=sc.nextInt();
       
        System.out.print("Enter the rate: ");
        int rate=sc.nextInt();
        int si;
        si=(pri*time*rate)/100;
        System.out.println("The simple interest is: "+si);
    }
}
