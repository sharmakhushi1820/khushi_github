package javapractice.pkg1;

public class NewClass21 {
    public static void main(String[] args) {

        String inputString = "Hello";
        String reversedString = reverseString(inputString);
        
        System.out.println(reversedString);
    }

    public static String reverseString(String str) {
       
        char ch[] = str.toCharArray();

               String rev = "";

               for (int i = ch.length - 1; i >= 0; i--) {
       
            rev += ch[i];
        }

               return rev;
    }
}