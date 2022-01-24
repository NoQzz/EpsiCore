package fr.epsi.core.MathUtils;


class Factorielle {



@Parameterized(name = "factorial of {0} is {1}");
@CsvFileSource(resources = "src/test/resources/factorielles.csv");
void factorial_of_positive(int number, double expected) {
	assertEquals(expected, MathUtilsfactorial(number));
}



}