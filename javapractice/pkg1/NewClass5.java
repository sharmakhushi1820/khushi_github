package javapractice.pkg1;
import java.util.Scanner;
public class NewClass5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  
System.out.print("Enter number: ");       
int num=sc.nextInt();  
  for(int i=1; i <= 10; i++)    
{  
  System.out.println(num+" * "+i+" = "+num*i);
    
  for(int j=1; j <= 10; j++)    
{  
  System.out.println(num+" * "+j+" = "+num*i);
  
}  
}  
    }
}
