package javapractice.pkg1;
import java.util.Scanner;
public class NewClass13 {
public static void main(String args[]){
    try 
        (Scanner sc = new Scanner(System.in)) {
        int n, t1 = 0, t2 = 1, nextTerm = 0, i;
        System.out.println("Enter the n value: ");
        n = sc.nextInt();
        if (n == 0 || n == 1) {
            System.out.println(n);
        } else {
            System.out.print("Fibonacci Series up to " + n + " terms: ");
            System.out.print(t1 + " " + t2); // Print the first two terms

            for (i = 3; i <= n; ++i) {
                nextTerm = t1 + t2;
                System.out.print(" " + nextTerm); // Print the next term
                t1 = t2;
                t2 = nextTerm;
            }
        }
    }
    }
}