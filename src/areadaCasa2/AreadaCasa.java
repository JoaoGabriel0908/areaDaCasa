package areadaCasa2;

import java.util.Scanner;

public class AreadaCasa {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		String comodo,resposta = "s";
		double largura,comprimento,metros,area=0;
	
		System.out.print("Você deseja calcular? ");
		resposta=leitor.next();
		
		if(resposta.equals("s")) {
			
			while (resposta.equals("s")) {
				System.out.print("Qual o nome do cômodo? ");
				comodo = leitor.next();
				System.out.print("Qual a largura? ");
				largura = leitor.nextDouble();
				System.out.print("Qual o comprimento? ");
				comprimento = leitor.nextDouble();
				
				metros=largura*comprimento;
				System.out.println("A " + comodo + " tem " + metros + " metros quadrados ");
			
				System.out.println("Você deseja calcular mais cômodos(s/n)? ");
				resposta = leitor.next();
				
				area=metros+area;
				
				
			}
		
			leitor.close();
		
			System.out.println(" A área total da casa é " + area + "metros quadrados");
		}
	}
}
