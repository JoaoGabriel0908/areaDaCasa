package areadaCasa2;

import java.util.Scanner;

public class AreadaCasa {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		String comodo,resposta = "s";
		double largura,comprimento,metros,area=0;
	
		System.out.print("Voc� deseja calcular? ");
		resposta=leitor.next();
		
		if(resposta.equals("s")) {
			
			while (resposta.equals("s")) {
				System.out.print("Qual o nome do c�modo? ");
				comodo = leitor.next();
				System.out.print("Qual a largura? ");
				largura = leitor.nextDouble();
				System.out.print("Qual o comprimento? ");
				comprimento = leitor.nextDouble();
				
				metros=largura*comprimento;
				System.out.println("A " + comodo + " tem " + metros + " metros quadrados ");
			
				System.out.println("Voc� deseja calcular mais c�modos(s/n)? ");
				resposta = leitor.next();
				
				area=metros+area;
				
				
			}
		
			leitor.close();
		
			System.out.println(" A �rea total da casa � " + area + "metros quadrados");
		}
	}
}
