package lab11;

public class main {

	public int palindrome(int num, int low, int x, String word) {
		if (num > 0) {
				if (word.charAt(low) == word.charAt(num - 1)) {
					System.out.println(word.charAt(low) + " " + word.charAt(num - 1));
					System.out.println("true");
					x++;
					low++;
					if(x == word.length()) {
						System.out.println(word + " is a palindrome");
					}
				}
				else {
					System.out.println(word + " not a palindrome");
					return 1;
				}
			}
		if (num == 0) {
			return 1;
		}
		return palindrome(num - 1, low, x, word);
	}
	
	public String letter(int num, int low, String word) {
		while(low < (num - 1)) {
			if(Character.isLetter(word.charAt(low))) {	
				System.out.println(word.charAt(low) + " is a letter");
				low++;
			}
			else {
				if(Character.isDigit(word.charAt(low))){
					System.out.println(word.charAt(low) + " is a digit");
					String x = Character.toString(word.charAt(low));
					word = word.replace(x, "");	
				}
				else if(Character.isWhitespace(word.charAt(low))) {
					System.out.println(word.charAt(low) + " is a space");
//					String x = Character.toString(word.charAt(low));
					word = word.replaceAll(" ", "");	
				}
				else {
					System.out.println(word.charAt(low) + " is a symbol");
					String x = Character.toString(word.charAt(low));
					word = word.replace(x, "");	
				}
			}
			num = word.length();
		}
		return word;
		
	}

}
