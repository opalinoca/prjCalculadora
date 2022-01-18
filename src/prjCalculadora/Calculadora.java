package prjCalculadora;
import java.util.Scanner;
public class Calculadora {
	
	Scanner in = new Scanner(System.in);
	
	//METODOS
	
	public void Somar() {
		System.out.println("Digite o primeiro número:");
		int a = in.nextInt();
		
		System.out.println("Digite o segundo número:");
		int b = in.nextInt();
		
		System.out.println("O valor da soma é:"+a+b);
	}
	
	public int Subtrair() {
		 System.out.println("Digite o primeiro número:");
         int a = in.nextInt();
		
		 System.out.println("Digite o segundo número:");
		 int b = in.nextInt();
		
		 return a-b;
	}
		 
    public void Mult(int a, int b) {
			 int m = a*b;
			 System.out.println("O valor da multiplicação é:"+m);
    }
		
    public int Dividir(int a, int b) {
			 int d = a/b;
			 return d;
      }
    }

