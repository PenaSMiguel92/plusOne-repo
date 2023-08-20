public class Solution {
    public int[] plusOne(int[] digits) {
        if (digits.length == 0)
            return new int[] { 1 };
        
        int carry = 0;
        for (int index = digits.length - 1; index >= 0; index--) {
            int sum = carry + digits[index] + 1;
            digits[index] = sum % 10;
            carry = sum > 9 ? 1 : 0;
        }
        if (carry != 0) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = carry;
            for (int index = 0; index < digits.length; index++) {
                newDigits[index + 1] = digits[index];
            }
            return newDigits;
        }
        return digits;
    } 
}
