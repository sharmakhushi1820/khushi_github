package javapractice.pkg1;
public class NewClass6 {
    public static void main(String args[]){
        int sum = 0;
        for(int i=2;i<20;i+=2){
            sum+=i;
            System.out.print(i+"+");
            }
        sum+=20;
        System.out.print(20+"="+sum);
        }
}