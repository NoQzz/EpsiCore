package fr.epsi.core.utilities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import fr.epsi.core.StringUtils;

public class StringUtilsTests {
	@Nested
	class IsPalindrome {
		@ParameterizedTest(name = "{0} cette chaine est un palindrome ")
		@ValueSource(strings = "kayak")
		void is_palindrome(String string) {
			assertTrue(StringUtils.isPalindrome(string));

		}

		@ParameterizedTest(name = "{0} cette chaine n'est pas un palindrome ")
		@ValueSource(strings = "oui")
		void is_Notpalindrome(String string) {
			assertFalse(StringUtils.isPalindrome(string));

		}
	}

	@Nested
	class Cesar {

		@ParameterizedTest(name = "{0} encodee :{1}  ")
		@CsvFileSource(resources = "/data/cesar.csv")

		void cesarEncode(String sentence, String request, int step) {
			assertEquals(request, StringUtils.cesarEncode(sentence, step));

		}

		@ParameterizedTest(name = "{1} decodee donne :{0}  ")
		@CsvFileSource(resources = "/data/cesar.csv")

		void cesarDecode(String sentence, String request, int step) {
			assertEquals(sentence, StringUtils.cesarDecode(request, step));

		}
	}

}
