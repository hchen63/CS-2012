package lab11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void test() {
		main m = new main();
		String word = "Madam, I'm Adam";
		word = word.toLowerCase();
		
		int num = word.length();
		int low = 0;
		int x = 0;	
		
		word = m.letter(num, low, word);
		num = m.letter(num, low, word).length();
		low = 0;
		
		System.out.println(word);
		
		m.palindrome(num, low, x, word);
	}

}
