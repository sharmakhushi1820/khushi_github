package javapractice.pkg1;
public class NewClass20 {
    
    public int[]  reverseArray(int arr[])  
{    
    int size = arr.length;  
  
    int temp[] = new int[size];  
      
    int index = 0;  
    for(int i = size - 1; i >= 0; i--)  
    {  
        temp[i] = arr[index];  
        index = index + 1;  
    }  
      
    return temp;  
      
} 
public static void main(String argvs[])   
{  
   NewClass20 obj = new NewClass20();
  int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};  
  int len = arr.length;  
  int ans[] = obj.reverseArray(arr);  
    
  System.out.println("For the input array: ");  
  for(int  i = 0; i < len; i++)  
  {  
     System.out.print(arr[i] + " ");  
  }  
    
  System.out.println();  
  System.out.println("The reversed array is: ");  
  for(int  i = 0; i < len; i++)  
  {  
     System.out.print(ans[i] + " ");  
  }  
    
  System.out.println("\n ");  
  int arr1[] = {4, 8, 3, 9, 0, 1};  
    
  len = arr1.length;  
  int ans1[] = obj.reverseArray(arr1);  
    
  System.out.println("For the input array: ");  
  for(int  i = 0; i < len; i++)  
  {  
     System.out.print(arr1[i] + " ");  
  }  
    
  System.out.println();  
  System.out.println("The reversed array is: ");  
  for(int  i = 0; i < len; i++)  
  {  
     System.out.print(ans1[i] + " ");  
  }  
        
   
}  
}  