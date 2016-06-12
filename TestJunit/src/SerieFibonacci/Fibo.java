package SerieFibonacci;

public class Fibo {
	public static boolean ehFibonacci(int n) {
	    int fib1 = 0;
	    int fib2 = 1;
	    do {
	        int saveFib1 = fib1;
	        fib1 = fib2;
	        fib2 = saveFib1 + fib2;
	        }
	    while (fib2 < n);

	    if (fib2 == n)
	        return true;
	    else
	        return false;

	}

}
