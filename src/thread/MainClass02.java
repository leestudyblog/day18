package thread;

import java.util.Scanner;

class A{
	public void run() {
		while(true) {
			System.out.println("print");

			try {
			Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	} 
}

public class MainClass02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s =null;
		A a = new A();
		a.run();
		while (true) {
			System.out.println("입력");
			s=sc.next();
			//System.out.println("출력하는 공간");
			System.out.println(s);
		}
	}

}
