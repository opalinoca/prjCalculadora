package prjCalculadora;
import java.util.Scanner;
public class Principal {

	public static void main(String [] args) {
		
		Calculadora calc = new  Calculadora();
		
		calc.Somar();
		calc.Subtrair();
		calc.Mult(3, 4);
		calc.Mult(5, 3);
	}
}

