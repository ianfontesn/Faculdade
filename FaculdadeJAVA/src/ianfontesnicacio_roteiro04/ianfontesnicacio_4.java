package ianfontesnicacio_roteiro04;

public class ianfontesnicacio_4 {
	public static void main(String[] args) {

		double vetorAoQuadrado[] = new double[10];

		for (int i = 0; i < 10; i++) {
			vetorAoQuadrado[i] = Math.pow(i, 2);
			System.out.println((int) vetorAoQuadrado[i]);
		}
	}
}