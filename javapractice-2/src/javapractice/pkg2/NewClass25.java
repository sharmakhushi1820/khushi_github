package javapractice.pkg2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class NewClass25 {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 2, 4, 5, 6, 5, 4};
        
        int[] resultArray = getDistinctElements(inputArray);
        
        System.out.println("Distinct Elements Array: " + Arrays.toString(resultArray));
    }

    public static int[] getDistinctElements(int[] inputArray) {
        
        Set<Integer> distinctSet = new HashSet<>();
        for (int num : inputArray) {
            distinctSet.add(num);
        }
        int[] resultArray = new int[distinctSet.size()];
        int index = 0;
        for (int num : distinctSet) {
            resultArray[index++] = num;
        }

        return resultArray;
    }
}