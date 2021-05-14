import java.util.Scanner;

public class PalindromeDetector 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");

		String checkPalindrome = input.nextLine();
		System.out.println("");

		if (isPalindrome(checkPalindrome))
		{
			System.out.println(checkPalindrome + " is a palindrome");
		}
		else
		{
			System.out.println(checkPalindrome + " is not a palindrome");
		}
	}

	public static boolean isPalindrome(String str)
	{
		str = str.toUpperCase();

		boolean result = false;

		if (str.length() <= 1)
		{
			result = true;
		}
		else if (str.charAt(0) == str.charAt(str.length() - 1))
		{
			result = isPalindrome(str.substring (1, str.length() - 1));
		}

		return result;
	}
}