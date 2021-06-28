
public class Calculator {
	public double nemeh(double a, double b) {
		return a + b;
	}
	public double hasah(double a, double b) {
		return a - b;
	}
	public double urjih(double a, double b) {
		return a * b;
	}
	public double huwaah(double a, double b) {
		return a / b;
	}
	public double plusOrMinus(double a) {
		return a*(-1);
	}
	public double zereg2(double a) {
		return a * a;
	}
	public double zereg3(double a) {
		return a * a * a;
	}
	public double huwi(double a, double b) {
		return a / 100 * b ;
	}
	public double fact(double a) {
		if(a > 0) {
			int result = 1;
			for(int i=1; i<=a; i++) {
				result = result * i;
			}
			return result; 
			}
			else 
				return -1;
		
	}
}
