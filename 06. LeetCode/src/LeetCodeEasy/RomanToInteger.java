package LeetCodeEasy;

import java.util.HashMap;
import java.util.Map;

//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

public class RomanToInteger {
	public static void main(String[] args) {
		RomanToInteger ob = new RomanToInteger();
		String val = "MCMXCIV";
		System.out.println(ob.romanToInt(val));

	}

	int romanToInt(String s) {
		Map<Character, Integer> romanMap = new HashMap<>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);

		int result = 0;
		int previousValue = 0;

		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			int currentValue = romanMap.get(c);
			System.out.println("currentValue "+currentValue);

			if (currentValue >= previousValue) {
				result += currentValue;
			} else {
				result -= currentValue;
			}

			previousValue = currentValue;
		}

		return result;

	}
}
