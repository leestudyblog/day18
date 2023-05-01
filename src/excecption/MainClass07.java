//nextLine
package excecption;

import java.util.Scanner;

public class MainClass07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;
		while(true) {
			try {
				System.out.println("수입력");
				num = sc.nextInt();
				System.out.println(num);
			} catch (Exception e) {
				sc.nextLine();//무한반복 방지 try 첫 문장으로 돌아감 
				System.out.println("문제 o");
			}
		}
	}

}
