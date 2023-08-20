public class Solution {
    public int[] plusOne(int[] digits) {
        if (digits.length == 0)
            return new int[] { 1 };
        int n = digits.length;
        int carry = 1;
        for (int index = n - 1; index >= 0; index--) {
            int sum = carry + digits[index];
            digits[index] = sum % 10;
            carry = sum / 10;
        }

        if (carry > 0) {
            int[] newDigits = new int[n + 1];
            newDigits[0] = carry;
            System.arraycopy(digits, 0, newDigits, 1, n);
            return newDigits;
        }
        return digits;
    } 
}
