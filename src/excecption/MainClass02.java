package excecption;

import java.util.Scanner;

class A02{
	public void test() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("no");
			return;
		}catch(Exception e) {
			System.out.println("ok");
		}finally {
			System.out.println("마지막 해야하는 작업");
			sc.close(); // 해당 작업 종료
		}
		System.out.println("next");
		return;

	}
}


public class MainClass02 {
	public static void main(String[] args) {
		A02 a = new A02();
		a.test();
	}

}
