import java.util.Scanner;
class tarea1git {
	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe el primer número: ");
		double primerNumero = Double.parseDouble(sc.nextLine());
		System.out.println("Escribe el segundo número: ");
		double segundoNumero = Double.parseDouble(sc.nextLine());

		double resultado = primerNumero + segundoNumero;
		System.out.println("La suma es " + resultado);
	}
}