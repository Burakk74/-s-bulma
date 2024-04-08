package üsbulma;

import java.util.Scanner;

public class üsbulma {

public static void main(String[] args) {
	

		Scanner input = new Scanner(System.in);
		
		System.out.print("enter the N value :");
		int n = input.nextInt();

		System.out.print("Enter the limit number :");
		int k = input.nextInt();
		
		for(int i = 1 ; i <= k; i *= n) {
			System.out.println(i);
		}
		
		System.out.println();
}	

}
