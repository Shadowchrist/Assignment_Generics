package generics;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class MaximumTest {

	@Test
	public void givenIntegerArray_OfSize3_ReturnMaximum() {
		Maximum<Integer> max = new Maximum<Integer>(new Integer[] { 3, 2, 1 });
		Assert.assertEquals(new Integer(3), Maximum.findMaxOfThreeInputs(max));
	}

	@Test
	public void givenIntegerArray_OfSize4_ReturnMaximum() {
		Maximum<Integer> max = new Maximum<Integer>(new Integer[] { 3, 2, 1, 4 });
		Assert.assertEquals(new Integer(4), Maximum.findMaxOfThreeInputs(max));
	}

	@Test
	public void givenIntegerArray_OfSize0_ReturnNull() {
		Maximum<Integer> max = new Maximum<Integer>(new Integer[6]);
		Assert.assertEquals(null, Maximum.findMaxOfThreeInputs(max));
	}

//FLOAT TEST	
	@Test
	public void givenFloatArray_OfSize3_ReturnMaximum() {
		Maximum<Float> max = new Maximum<Float>(new Float[] { 3f, 2f, 1f });
		Assert.assertEquals(new Float(3f), Maximum.findMaxOfThreeInputs(max));
	}

	@Test
	public void givenFloatArray_OfSize5_ReturnMaximum() {
		Maximum<Float> max = new Maximum<Float>(new Float[] { 3f, 4f, 1f, 2f, 6f });
		Assert.assertEquals(new Float(6f), Maximum.findMaxOfThreeInputs(max));
	}

	@Test
	public void givenFloatArray_OfSize0_ReturnNull() {
		Maximum<Float> max = new Maximum<Float>(new Float[4]);
		Assert.assertEquals(null, Maximum.findMaxOfThreeInputs(max));
	}

//STRING TEST
	@Test
	public void givenStringArray_OfSize3_ReturnMaximum() {
		Maximum<String> max = new Maximum<String>(new String[] { "Cherries", "Banana", "Apple" });
		Assert.assertEquals(new String("Cherries"), Maximum.findMaxOfThreeInputs(max));
	}

	@Test
	public void givenStringArray_OfSize4_ReturnMaximum() {
		Maximum<String> max = new Maximum<String>(new String[] { "Cherries", "Grapefruit", "Apple", "Kiwi" });
		Assert.assertEquals(new String("Kiwi"), Maximum.findMaxOfThreeInputs(max));
	}

	@Test
	public void givenStringArray_OfSize0_ReturnNull() {
		Maximum<String> max = new Maximum<String>(new String[4]);
		Assert.assertEquals(null, Maximum.findMaxOfThreeInputs(max));
	}
}
