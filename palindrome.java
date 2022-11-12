import java.util.Scanner;
public class palindrome{
    public static void main(String args[]){
        int a;
        System.out.println("Enter even number-");
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        if(a%2!=0){
            System.out.println("Number entered is not even");
        }
        else{
            int c=a,s=0,r;

            while(a>0){
                r=a%10;
                s=r+(s*10);
                a=a/10;
            }
            if(c==s){
                System.out.println("number is palindrome");
            }else{System.out.println("Number is not palindrome");
        }
    }
}}