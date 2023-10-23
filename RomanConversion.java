package com.cloudvandana.assignment1;
import java.util.*;
public class RomanConversion {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        int prevValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int value = map.get(s.charAt(i));
            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }

            prevValue = value;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("EnterRomanNumber");
        String romanNumeral = sc.next();
        int intValue = romanToInt(romanNumeral);
        System.out.println("The corresponding Integer value is: " + intValue);
    }
}
