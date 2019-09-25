package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import stackroute.CollectionsFunction;

class CollectionsTest {

	@Test
	void question2Test() {
		Map<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("one", 5);
		hm.put("two", 2);
		hm.put("three", 2);
		assertEquals("Palindrome test",hm.toString(),CollectionsFunction.wordCount("one one -one___two,,three,one @three*one?two ").toString());
	}
	@Test
	void question3Test() {
		Map<String,Boolean> hm = new HashMap<String,Boolean>();
		hm.put("a",true);
		hm.put("b",false);
		hm.put("c",true);
		assertEquals("Palindrome test",hm.toString(),CollectionsFunction.moreThan2("a b c a c").toString());
	}
}
