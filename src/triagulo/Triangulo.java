package triagulo;

import java.util.Scanner;

public class Triangulo {
	Scanner leitor = new Scanner(System.in);
	int ladoA = 0; 
	int ladoB = 0;
	int ladoC = 0;
	
	public void verificarTriangulo() {
		System.out.println("Digite o valor do lado A: ");
		ladoA = leitor.nextInt();
		
		System.out.println("Digite o valor do lado B: ");
		ladoB = leitor.nextInt();
		
		System.out.println("Digite o valor do lado C: ");
		ladoC = leitor.nextInt();
		
		if(((ladoA + ladoB) > ladoC) && ((ladoA + ladoC) > ladoB) && ((ladoB + ladoC) > ladoA)) {
			System.out.print("� um Tri�ngulo!!!");
		}else
			System.out.print("N�O � um Tri�ngulo!!!");
	}
	
}
