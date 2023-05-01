//강제 예외
package excecption;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age =0 ;
		System.out.println("age?");
		try {
			age=sc.nextInt();
			if(age <1) {
				throw new Exception("잘못입력");
			}
			System.out.println(age);
		} catch (Exception e) {
			System.out.println(e.getMessage()); 
			
		}
		System.out.println("next");
		
	}

}
