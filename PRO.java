import java.util.Scanner;
public class PRO {
    public static void main(String args[]){
//     int n=153;
     int n;
     System.out.println("enter number");
     Scanner sc=new Scanner(System.in) ;
     n=sc.nextInt();
     int temp=n;
     int r,sum=0;
     while(n>0){
         r=n%10;
         n=n/10;
         sum=sum+r*r*r;
     }
        if(temp==sum) {
            System.out.println("number is armstrong");
        }else{  System.out.println("number is not  armstrong");
        }
    }
        }
