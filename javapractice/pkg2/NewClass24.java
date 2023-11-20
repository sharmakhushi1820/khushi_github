package javapractice.pkg2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class NewClass24 {
    public static void main(String[] args) {
        
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {3, 4, 5, 6};
        
        int[] resultArray = arrayDifference(array1, array2);
        
        System.out.println("Array Difference Array: " + Arrays.toString(resultArray));
    }

    public static int[] arrayDifference(int[] array1, int[] array2) {
        
        List<Integer> list2 = new ArrayList<>();
        for (int num : array2) {
            list2.add(num);
        }

        List<Integer> differenceList = new ArrayList<>();
                for (int num : array1) {
            if (!list2.contains(num)) {
                differenceList.add(num);
            }
        }

                int[] resultArray = new int[differenceList.size()];
        for (int i = 0; i < differenceList.size(); i++) {
            resultArray[i] = differenceList.get(i);
        }

        return resultArray;
    }
}
