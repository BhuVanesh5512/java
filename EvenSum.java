import java.util.*;
public class EvenSum {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter N: ");
        int n=sc.nextInt();
        int a=Evend(n);
        System.out.println("Sum of even digits: "+a);
    }
     private static int Evend(int n){
        if(n==0){
            return 0 ;
        }else{
        int digit=n%10;
        return (digit %2 ==0 ?digit : 0)+ Evend(n/10);
    }
}
}
