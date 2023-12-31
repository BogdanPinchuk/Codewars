package org.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

	@Test
	public void testSomething() {
		assertEquals("Hello, Ryan how are you doing today?", Kata.greet("Ryan"));
	}

	@Test
	public void sampleTests() {
		assertEquals("dlrow", Kata.solution("world"));
	}

	@Test
	public void tests() {
		assertEquals(true, Kata.betterThanAverage(new int[] {2, 3}, 5));
		assertEquals(true, Kata.betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75));
		assertEquals(true,
				Kata.betterThanAverage(new int[] {12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
		assertEquals(false, Kata.betterThanAverage(new int[] {100, 90}, 11));
	}

	@Test
	void basicTest() {
		assertArrayEquals(new Object[] {"Hello", "Hello Again"},
				Kata.removeEveryOther(new Object[] {"Hello", "Goodbye", "Hello Again"}));
		assertArrayEquals(new Object[] {new Object[] {1, 2}},
				Kata.removeEveryOther(new Object[] {new Object[] {1, 2}}));
		assertArrayEquals(new Object[] {1, 3, 5, 7, 9},
				Kata.removeEveryOther(new Object[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
		assertArrayEquals(new Object[] {"Goodbye"},
				Kata.removeEveryOther(new Object[] {"Goodbye"}));
		assertArrayEquals(new Object[] {}, Kata.removeEveryOther(new Object[] {}));
	}

	@Test
	public void basicTests() {
		assertEquals("Hello boss", Kata.greet("Daniel", "Daniel"),
				"For inputs \"Daniel\" and \"Daniel\"");
		assertEquals("Hello guest", Kata.greet("Greg", "Daniel"),
				"For inputs \"Greg\" and \"Daniel\"");
	}

	@Test
	public void testSomething2() {
		assertTrue(Kata.zeroFuel(50, 25, 2));
		assertFalse(Kata.zeroFuel(100, 50, 1));
	}

	@Test
	public void staticTests() {
		check("samurai", "ai", true);
		check("sumo", "omo", false);
		check("ninja", "ja", true);
		check("sensei", "i", true);
		check("samurai", "ra", false);
		check("abc", "abcd", false);
		check("abc", "abc", true);
		check("abcabc", "bc", true);
		check("ails", "fails", false);
		check("fails", "ails", true);
		check("this", "fails", false);
		check("this", "", true);
		check(":-)", ":-(", false);
		check("!@#$%^&*() :-)", ":-)", true);
		check("abc\n", "abc", false);
	}

	private static void check(String str, String ending, boolean expected) {
		boolean result = Kata.solution(str, ending);
		assertEquals(expected, result,
				"Expected solution(\"" + str + "\", \"" + ending + "\") to return " + expected);
	}

	@Test
	public void tests0() {
		assertEquals("67", Kata.numberToString(67));
		assertEquals("123", Kata.numberToString(123));
		assertEquals("999", Kata.numberToString(999));
	}

	@Test
	public void findShort() {
		assertEquals(3, Kata.findShort("bitcoin take over the world maybe who knows perhaps"));
		assertEquals(3, Kata.findShort("turns out random test cases are easier than writing out basic ones"));
		assertEquals(2, Kata.findShort("Let's travel abroad shall we"));
	}

	@Test
	public void countPositivesSumNegatives_BasicTest() {
		int[] expectedResult = new int[] {10, -65};
		assertArrayEquals(expectedResult, Kata.countPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));
	}

	@Test
	public void countPositivesSumNegatives_InputWithZeroes() {
		int[] expectedResult = new int[] {8, -50};
		assertArrayEquals(expectedResult, Kata.countPositivesSumNegatives(new int[] {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}));
	}

	@Test
	public void testSomething0() {
		final double DELTA = 1e-15;
		assertEquals(1, Kata.find_average(new int[]{1,1,1}), DELTA);
		assertEquals(2, Kata.find_average(new int[]{1, 2, 3}), DELTA);
	}

	@Test
	public void test1() {
		assertEquals(-42, Kata.makeNegative(42));
	}

	@Test
	public void tests1() {
		assertEquals(-1, Kata.opposite(1));
		assertEquals(1, Kata.opposite(-1));
		assertEquals(0, Kata.opposite(0));
		assertEquals(-5, Kata.opposite(5));
		assertEquals(7, Kata.opposite(-7));
	}

	@Test
	public void exampleCases() {
		assertEquals("elbuod  [decapS]  sdrow", Kata.reverseWords("double  [Spaced]  words"));
		assertEquals("sihT si", Kata.reverseWords("This is"));
		assertEquals("sihT", Kata.reverseWords("This"));

		assertEquals("!elur esac  !elur  .noitulos   a  si   ot  ataK stset  diova   sihT  ataK  ataK  esac  .noitulos ot sihT  esac ataK  diova  dedocodrah  !elur  .noitulos evah   .noitulos", Kata.reverseWords("rule! case  rule!  solution.   a  is   to  Kata tests  avoid   This  Kata  Kata  case  solution. to This  case Kata  avoid  hardocoded  rule!  solution. have   solution."));

		assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", Kata.reverseWords("The quick brown fox jumps over the lazy dog."));
		assertEquals("elppa", Kata.reverseWords("apple"));
		assertEquals("a b c d", Kata.reverseWords("a b c d"));
		assertEquals("elbuod  decaps  sdrow", Kata.reverseWords("double  spaced  words"));
	}

	@Test
	public void basicTests0() {
		assertEquals(false, Kata.checkForFactor(7889, 5));
		assertEquals(true, Kata.checkForFactor(10, 2));
		assertEquals(true, Kata.checkForFactor(63, 7));
		assertEquals(true, Kata.checkForFactor(2450, 5));
		assertEquals(true, Kata.checkForFactor(24612, 3));
	}

}
