package ToSolving;

import java.math.BigInteger;
import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		for (int i = 1; i <= N; i++) {
			for (int j= 0; j<N-i; j++) { //공백 + 별의 조합으로 공백이 -로 ?
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


