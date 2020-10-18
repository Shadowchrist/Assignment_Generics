package generics;

public class Maximum<K> {
	K a;
	K b;
	K c;

	public Maximum(K a, K b, K c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	@SuppressWarnings("hiding")
	public <K extends Comparable<K>> K findMaxOfThreeInputs(Maximum<K> maxObject) {

		K max = maxObject.a;
		if (maxObject.b.compareTo(max) > 0)
			max = maxObject.b;
		if (maxObject.c.compareTo(max) > 0)
			max = maxObject.c;
		return max;
	}
}
