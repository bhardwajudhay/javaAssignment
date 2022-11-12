import java.util.Scanner;
public class operation {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter value of a-" );
        a=sc.nextInt();
        System.out.println("enter value of b-" );
        b=sc.nextInt();
        int sum;
        sum=a+b;
        System.out.println("Sum of two numbers is- "+sum);
        int sub=a-b;
        System.out.println("Subtraction of two numbers is- "+sub);
        int mul=a*b;
        System.out.println("Multiplication of two numbers is- "+mul);
        int div=a/b;
        System.out.println("Division of two numbers is- "+div);
    }
}