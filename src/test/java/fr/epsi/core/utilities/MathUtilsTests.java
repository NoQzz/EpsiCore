package fr.epsi.core.utilities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import fr.epsi.core.MathUtils;
import fr.epsi.core.StringUtils;

class MathUtilsTests {
	@Nested
	@DisplayName("MathUils.factorial")
	class FactorialMethod {
		@ParameterizedTest(name = "factorial of {0} is {1}")
		@CsvFileSource(resources = "/data/factorielles.csv")
		void factorial_of_positive(int number, double expected) {
			assertEquals(expected, MathUtils.factorial(number));
		}
	}

	@Nested
	class IsPrime {

		@ParameterizedTest(name = "{0} is a prime number")
		@ValueSource(ints = { 2, 5, 7, 17, 89 })
		void is_prime(int number) {
			assertTrue(MathUtils.isPrimeNumber(number));
		}

		@ParameterizedTest(name = "{0} is a not prime number")
		@ValueSource(ints = { 1, 4, 6, 16, 35, 50 })
		void is_notprime(int number) {
			assertFalse(MathUtils.isPrimeNumber(number));

		}
	}

	
}
