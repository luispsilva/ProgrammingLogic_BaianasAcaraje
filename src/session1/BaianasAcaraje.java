package session1;

import java.util.Scanner;

public class BaianasAcaraje {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String entrada;
		int num = -1;
		
		while (num != 0) {
			
			System.out.println("\nType a number:");
			entrada = sc.nextLine();
			
			try {
                num = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("The program allows integer number only");
            }
			
			if(num%3==0) {
				System.out.print("Cira");
				
			}if (entrada.contains("5")) {
				System.out.print("Dinha");
			}
		}
		
		sc.close();

	}

}
