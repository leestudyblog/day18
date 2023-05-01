//nextLine
package excecption;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1=null, s2=null;
		
		System.out.println("1.");
		s1 = sc.nextLine(); //nextLine: enter 값만 구분자로 인식
		System.out.println("2.");
		s2 = sc.next();
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		
		System.out.println("1.");
		s1 = sc.next(); //next: 공백을 구분자로 인식
		System.out.println("2.");
		s2 = sc.next();
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		
		
	}

}
