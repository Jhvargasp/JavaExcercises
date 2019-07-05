
public class PalindomValidation {

	public static void main(String[] args) {
		String[] texts = { "asdfadsa", "asdffdsa", "dad", "", "a", null };
		for (String string : texts) {
			System.out.println("Is '" + string + "' a palindrom: " + validatePalindrom(string));
		}

	}

	private static boolean validatePalindrom(String text) {
		// prepare text to validate
		if (text == null)
			return false;
		// 1. make all lower case (case insensitive)
		text = text.toLowerCase();
		// 2. remove non text characters (a-z)
		text = text.replaceAll("[^a-z]", "");
		// call function to check characters
		return checkPalindromeByWords(text);

	}

	private static boolean checkPalindromeByWords(String text) {

		int init = 0, end = text.length() - 1;
		while (init < end) {
			if (text.charAt(init) != text.charAt(end)) {
				return false;
			} else {
				init++;
				end--;
			}
		}
		return true;

	}
}
