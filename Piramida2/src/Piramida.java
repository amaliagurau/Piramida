import java.util.Scanner;

public class Piramida {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Piramida(sc);
	}
	
	public static void Piramida(Scanner sc) {
		System.out.println("Nr randuri:");
		int n = sc.nextInt();
		int m = 1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j <n-i; j++) {
				System.out.print(" ");
			}
		for(int k=1; k<=m; k++) {
			System.out.print(m+ " ");
		}
		System.out.println(" ");
		m++;
		}
	}
}
	
