package javapractice.pkg1;
public class NewClass9 {
  static int arr[] = { 3, 6, 9, 12, 15, 18 };
 
    
    static int sum()
    {
        int sum = 0; 
        int i;
 
        
        for (i = 0; i < arr.length; i++)
            sum += arr[i];
 
        return sum;
    }
 
    
    public static void main(String[] args)
    {
        System.out.println("Sum of given array is "
                           + sum());
    }
}
