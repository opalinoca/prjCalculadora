package prjCalculadora;
import java.util.Scanner;
public class Calculadora {
	
	Scanner in = new Scanner(System.in);
	
	//METODOS
	
	public void Somar() {
		System.out.println("Digite o primeiro n�mero:");
		int a = in.nextInt();
		
		System.out.println("Digite o segundo n�mero:");
		int b = in.nextInt();
		
		System.out.println("O valor da soma �:"+a+b);
	}
	
	public int Subtrair() {
		 System.out.println("Digite o primeiro n�mero:");
         int a = in.nextInt();
		
		 System.out.println("Digite o segundo n�mero:");
		 int b = in.nextInt();
		
		 return a-b;
	}
		 
    public void Mult(int a, int b) {
			 int m = a*b;
			 System.out.println("O valor da multiplica��o �:"+m);
    }
		
    public int Dividir(int a, int b) {
			 int d = a/b;
			 return d;
      }
    }

