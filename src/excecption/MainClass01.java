/*예외처리*/
package excecption;

class A01{
	public void test() {
		int num =0;
		try {
			int re = 10/num; // 문제 사항 ->catch 이동
			System.out.println("문제 없을 경우");
		}catch (Exception e) {
			System.out.println("문제 있을 경우");
			//e.printStackTrace();
		}finally {
			System.out.println("finally");
				
		}//finally
		System.out.println("next");
	}//test
}//class


public class MainClass01 {
	public static void main(String[] args) {

		A01 a = new A01();
		a.test();
		
		
	}

}
