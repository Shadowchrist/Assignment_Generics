package generics;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class MaximumTest {

	@Test
	public void givenMaxNumber_At1stPosition_ReturnNumber() {
		Maximum<Integer> max=new Maximum<Integer>(3, 2, 1);
		Assert.assertEquals(new Integer(3), max.findMaxOfThreeInputs(max));	
	}	
	@Test
	public void givenMaxNumber_At2ndPosition_ReturnNumber() {
		Maximum<Integer> max=new Maximum<Integer>(3, 4, 1);
		Assert.assertEquals(new Integer(4), max.findMaxOfThreeInputs(max));		
	}
	@Test
	public void givenMaxNumber_At3rdPosition_ReturnNumber() {
		Maximum<Integer> max=new Maximum<Integer>(3,4,5);
		Assert.assertEquals(new Integer(5), max.findMaxOfThreeInputs(max));		
	}
	
//FLOAT TEST	
	@Test
	public void givenMaxFloat_At1stPosition_ReturnFloat() {
		Maximum<Float> max=new Maximum<Float>(3f,2f,1f);
		Assert.assertEquals(new Float(3f), max.findMaxOfThreeInputs(max));		
	}	
	@Test
	public void givenMaxFloat_At2ndPosition_ReturnFloat() {
		Maximum<Float> max=new Maximum<Float>(3f,4f,1f);
		Assert.assertEquals(new Float(4f), max.findMaxOfThreeInputs(max));		
	}
	@Test
	public void givenMaxFloat_At3Position_ReturnFloat() {
		Maximum<Float> max=new Maximum<Float>(3f,4f,5f);
		Assert.assertEquals(new Float(5f), max.findMaxOfThreeInputs(max));		
	}

//STRING TEST
	@Test
	public void givenMaxString_At1stPosition_ReturnString() {
		Maximum<String> max=new Maximum<String>("Cherries","Banana","Apple");
		Assert.assertEquals(new String("Cherries"), max.findMaxOfThreeInputs(max));		
	}	
	@Test
	public void givenMaxString_At2ndPosition_ReturnString() {
		Maximum<String> max=new Maximum<String>("Cherries","Grapefruit","Apple");
		Assert.assertEquals(new String("Grapefruit"), max.findMaxOfThreeInputs(max));		
	}
	@Test
	public void givenMaxString_At3rdPosition_ReturnString() {
		Maximum<String> max=new Maximum<String>("Cherries","Banana","Kiwi");
		Assert.assertEquals(new String("Kiwi"), max.findMaxOfThreeInputs(max));		
	}

}
