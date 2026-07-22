class Solution {
    public String intToRoman(int num) {
        // Predefined values and their corresponding Roman numerals in descending order
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < values.length; i++) {
            // Repeat while the remaining number is greater than or equal to the current value
            while (num >= values[i]) {
                sb.append(symbols[i]);
                num -= values[i];
            }
        }
        
        return sb.toString();
    }
}