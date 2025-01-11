
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    boolean isprime = true;
    if(n== 1)
    {
        System.out.println("1 is not a prime number");
    }
    for(int i=2;i<=Math.sqrt(n);i++)
    {
        if(n%i==0)
        {
            isprime=false;
        }
    }
    if(isprime == true)
    {
        System.out.println(n + " is a prime number");

    }
    else
    {
        System.out.println(n + " is not a prime number");
    }
}
}
