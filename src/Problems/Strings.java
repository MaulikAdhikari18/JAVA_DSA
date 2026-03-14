package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strings {
    public int romanToInt(String s) {
        int total = 0;
        
        for(int i = 0;i < s.length();i++){
            int curr = value(s.charAt(i));

            if(i < s.length()-1 && curr < value(s.charAt(i+1))){
                total -= curr;
            }else{
                total += curr;
            }
        }
        return total;
    }

    private int value(char c){
        switch(c){
            case 'I':return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }

    //Length Of Last Word
    public int lengthOfLastWord(String s) {
        int count = 0, i = s.length()-1;

        while(i >= 0 && s.charAt(i) == ' ')i--;
        while(i >= 0 && s.charAt(i) != ' '){
            count++;
            i--;
        }
        return count;
    }

    //Largest Number
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for(int i = 0; i < nums.length; i++)
            arr[i] = String.valueOf(nums[i]);

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        if(arr[0].equals("0"))
            return "0";

        StringBuilder result = new StringBuilder();

        for(String s : arr)
            result.append(s);

        return result.toString();
    }

    //Integer to Roman
    public String intToRoman(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < values.length; i++){
            while(num >= values[i]){
                num -= values[i];
                result.append(symbols[i]);
            }
        }
        return result.toString();
    }

    //Zigzag Conversion
    public String convert(String s, int numRows) {
        if(numRows == 1 || s.length() <= numRows)
            return s;

        List<StringBuilder> rows = new ArrayList<>();

        for(int i = 0; i < numRows; i++)
            rows.add(new StringBuilder());

        int currentRow = 0;
        boolean goingDown = false;

        for(char c : s.toCharArray()) {

            rows.get(currentRow).append(c);

            if(currentRow == 0 || currentRow == numRows - 1)
                goingDown = !goingDown;

            currentRow += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();

        for(StringBuilder row : rows)
            result.append(row);

        return result.toString();
    }

    //Add Binary
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while(i >= 0 || j >= 0 || carry == 1){

            int sum = carry;

            if(i >= 0)
                sum += a.charAt(i--) - '0';

            if(j >= 0)
                sum += b.charAt(j--) - '0';

            result.append(sum % 2);
            carry = sum/2;
        }
        return result.reverse().toString();
    }
}
