package javapractice.pkg1;
public class NewClass10 {
    public static void main(String args[]){
     
        int[] array = {20,30,40,50,60,70,80,90};
 
     int length = array.length;
 
       int sum = 0;
 
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
 
        double average = sum / length;
         
        System.out.println("Average of array : "+average);
 
    }
 
}

    
