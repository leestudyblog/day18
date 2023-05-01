/*thread : 프로세스 단위*/
package thread;

class A01 extends Thread{ //Thread 상속
	public void run() {
		for (int i=0; i <100; i++ ) {
			System.out.println(i+ "A01");
		}
	}
}
class B01 extends Thread{
	public void run() {
		for (int i=0; i <100; i++ ) {
			System.out.println(i+ "B01");
		}
	}
}

public class MainClass01 {
	public static void main(String[] args) {
		A01 a = new A01();
		B01 b = new B01();
		//a.run();
		//b.run();
		a.setDaemon(true);
		b.setDaemon(true);
		a.start(); // CPU의 처리에 따라 결과가 다름
		b.start();
		System.out.println("end");
		System.out.println("end");// main 끝나도 a,b가 끝나지 않아 실행될 수 있음
		
		/*setDaemon : 해당 객체가 종료되면 다음 메소드도 종료*/
		
		
		
	}

}
