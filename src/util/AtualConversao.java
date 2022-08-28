package util;

public class AtualConversao {
	private static Double iof = 0.06;
	
	public static Double conversao(double valorDolar, double valor) {
		
		return valorDolar * valor * (1.0 + iof);
	}
}
