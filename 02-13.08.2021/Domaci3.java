package primer02;

import java.util.Scanner;

public class Domaci3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double broj = sc.nextDouble();
		
		if (broj <  10){
			broj = broj * 100;
		}else if(broj > 100){
			broj = broj / 10;
			
		}
		System.out.println(broj);
			// 10; 9; 101
	}

}
