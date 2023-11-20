package javapractice.pkg2;
public class NewClass29 {
    public static void main(String[] args) {
        String num1 = "123456789012345678901234567890";
        String num2 = "987654321098765432109876543210";

        String result = addLargeNumbers(num1, num2);

        System.out.println("Sum: " + result);
    }

    private static String addLargeNumbers(String num1, String num2) {
        StringBuilder result = new StringBuilder();

        int carry = 0;
        int maxLength = Math.max(num1.length(), num2.length());

        for (int i = 0; i < maxLength; i++) {
            int digit1 = i < num1.length() ? num1.charAt(num1.length() - 1 - i) - '0' : 0;
            int digit2 = i < num2.length() ? num2.charAt(num2.length() - 1 - i) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            result.insert(0, sum % 10);
        }

        if (carry > 0) {
            result.insert(0, carry);
        }

        return result.toString();
    }
}