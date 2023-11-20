package javapractice.pkg1;
import java.util.Scanner;
public class NewClass15 {
    public static void main(String args[]){
        long n , sum;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter a number: ");  
  n=sc.nextLong();  
  for(sum=0; n!=0; n=n/10)  
{        
sum = sum + n % 10;  
}   
System.out.println("Sum of digits: "+sum);  
}  
} 