package generics;

import java.util.*;

public class Maximum<K> {
	K[] array;

	public Maximum(K[] input) {
		this.array=input;
	}
	
	public static <K extends Comparable<K>> K findMaxOfThreeInputs(Maximum<K> maxObject) {

		int n= maxObject.array.length;
		Optional<K> checkIfNull = Optional.ofNullable(maxObject.array[n-1]);
		if(!checkIfNull.isEmpty())
		{
			Arrays.sort(maxObject.array);
			return maxObject.array[n-1];
		}
		else
		{
			System.out.println("Input is empty");		
			return null;
		}
	}
	
	public static <K> void printMaximumElement(K maximumElement) {
		System.out.println("Maximum is : "+maximumElement);
	}
}
