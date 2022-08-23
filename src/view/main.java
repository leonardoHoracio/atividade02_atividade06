package view;

import controller.calculo;

public class main {

	/*
	 *  Considerando exercícios realizados anteriormente, criar uma função 
recursiva que solucione a função (Entrada limitada a 10):
ss = 1 + 1 /2! + 1/ 3! +1 / 4! + … + 1 /nn!*/
	public static void main(String[] args) {

		calculo c = new calculo();
		
		int num = 4;
		
		double soma = c.funcaoRecursiva(num);
		
		System.out.println(soma);

	}

}
