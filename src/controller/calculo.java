package controller;

public class calculo {
	
	public calculo() {
		super();
	}
	
	public static double funcaoRecursiva(double n) {
		if (n == 1) { //cond de parada
			return 1;
		}
		else {
			double div = 1 / fatorial(n);//chamada da fun��o que c�lculo o fatorial
			n = n - 1;
			return div + funcaoRecursiva(n); //calculo funcao
		}	
	}
	
	
	private static double fatorial(double n) {
		if (n == 0) { //Condi��o de parada
			return 1;
		}else {
			return n * fatorial (n-1);// calculo realizado
			
		}
	}

}
