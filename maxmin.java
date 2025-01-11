import java.util.Scanner;
public class maxmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a=sc.nextInt();
        System.out.print("Enter the second number: ");
        int b=sc.nextInt();
        System.out.print("Enter the third number: ");
        int c=sc.nextInt();
        int max,min;
        max = max (a, b,c);
        min = min (a, b,c);
        System.out.println("Max:"+max);
        System.out.println("Min:"+min);
    }
        static int max(int a, int b, int c)
     {
            if(a>b && a>c)
            {
               return a;
            }
            else if(b>a && b>c)
            {
                return b;
                }
                else
                {
                    return c;
                    }
        }
        static int min(int a,int b,int c)
        {
            if(a<b && a<c)
            {
                return a;
            }
            else if(b<c && b<a)
            {
                return b;
            }
            else
            {
                return c;
            }
        }
    }    

