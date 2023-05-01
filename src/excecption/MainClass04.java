//예외전가와 예외 처리 차이
package excecption;

class A04{
	public void a01() {
		a02();
	}
	public void a02() {
		a03();
	}
	public void a03()  {
		System.out.println("a03실행");
		try {// 전가와 달리 모든 메소드에 예외 전가하지 않아도 됨
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
public class MainClass04 {
	public static void main(String[] args) {
		A04 a = new A04();
		a.a01();
	}

}
