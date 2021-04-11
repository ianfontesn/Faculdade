package ianfontesnicacio_roteiro04;

public class ianfontesnicacio_16 {

	public static void main(String[] args) {

		int fatorial[] = new int[10];

		for (int i = 0; i < 10; i++) {
			if (i == 0) {
				fatorial[i] = 1;
			} else if (i == 1) {
				fatorial[i] = 1;
			} else {

				int j = i;
				fatorial[i] = j;
				while (j > 1) {

					fatorial[i] = fatorial[i] * (j - 1);
					j--;

				}
			}
		}
		
		for(int result : fatorial) {
			System.out.print(result + ", ");
		}
	}
}
