package Day17_MoreExceptions;

public class Calculator {
	public int power(int n, int p) throws Exception {
		int a=0;
		if(n >= 0 && p >=0) {
			a =(int) Math.pow(n, p);
		}else {
			throw new Exception("n and p should be non-negative");
		}
		return a;
	}
}
