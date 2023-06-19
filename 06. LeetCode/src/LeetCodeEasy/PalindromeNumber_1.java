package LeetCodeEasy;

public class PalindromeNumber_1 {
	public static void main(String[] args) {
		System.out.println(isPalindrome(121));

	}

	static boolean isPalindrome(int x) {
		int reverseNum = 0;
		int tempOriginal = x;

		while (tempOriginal > 0) {

			int lastDigit = tempOriginal % 10;
//			System.out.println("l "+lastDigit);
			reverseNum = reverseNum * 10 + lastDigit;
//			System.out.println("r "+reverseNum);
			tempOriginal = tempOriginal / 10;
//			System.out.println("t "+tempOriginal);
		}

		if (x == reverseNum) {
			return true;
		} else {
			return false;
		}
	}

}
