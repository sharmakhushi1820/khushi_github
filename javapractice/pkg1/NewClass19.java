package javapractice.pkg1;
public class NewClass19 {
        public static void main(String args[]) {
            int[] arr = new int[]{5, 4, 3, 2, 1};
        int n = 3;

        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < n; i++) {
            int j, last;
            last = arr[0];
            for (j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[j] = last;
        }

        System.out.println();
        System.out.println("Array after right rotation:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}