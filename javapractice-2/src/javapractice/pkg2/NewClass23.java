package javapractice.pkg2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class NewClass23 {
   
  public static void main(String[] args) {
        
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {3, 4, 5, 6};
        
        int[] resultArray = symmetricDifference(array1, array2);
        
        System.out.println("Symmetric Difference Array: " + Arrays.toString(resultArray));
    }

    public static int[] symmetricDifference(int[] array1, int[] array2) {
        
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int num : array1) {
            list1.add(num);
        }

        for (int num : array2) {
            list2.add(num);
        }

        
        list1.removeAll(Arrays.asList(array2));
        list2.removeAll(Arrays.asList(array1));

        
        list1.addAll(list2);

        
        int[] resultArray = new int[list1.size()];
        for (int i = 0; i < list1.size(); i++) {
            resultArray[i] = list1.get(i);
        }

        return resultArray;
    }
}