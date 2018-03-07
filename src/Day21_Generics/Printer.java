package Day21_Generics;

public class Printer <T>{
	public void printArray(T[] intArray) {
		for (T t : intArray) {
			System.out.println(t);
		}
	}
}
