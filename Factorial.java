class Factorial {
	public static void main(String[] args) {
		System.out.println(FactorialIter(5));
	}
	
	public static int FactorialRec(int n) {
		if (n == 1) {
			return 1;
		}
		return (FactorialRec(n-1) * n);
	}
	
	public static int FactorialIter(int n) {
		int result = 1;
		for (int i = 1; i<=n; i++) {
			result *= i;
		}
		return result;
	}
}