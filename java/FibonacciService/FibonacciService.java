package FibonacciService;

public class FibonacciService {
	public static Double fibonacci(double posicion) {
		long siguiente = 1, actual = 0, temporal = 0;
		for (long x = 1; x <= posicion; x++) {
			// Si no quieres imprimirla, comenta la siguiente línea:
			System.out.println(actual + ", ");
			temporal = actual;
			actual = siguiente;
			siguiente = siguiente + temporal;
			}
		// Si no quieres imprimirla, comenta la siguiente línea:
		System.out.println(actual);
		System.out.println();
		return (double) actual;
		}
}
