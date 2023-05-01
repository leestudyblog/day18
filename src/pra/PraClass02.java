//문제 2 - 주민등록번호 인증 프로그램
/*
  - 90년생 이상은 가입불가 / 89년생 이하는 가입 가능
  - 'A,ㅁ,ㅋ' 문자는 잘못입력
  - 주민번호 앞 두자리 파싱
  - 주민번호 길이 파악
 */
package pra;

import java.util.Scanner;

class CheckInfo{
		Scanner sc = new Scanner(System.in);
		String num=null;
		boolean bool=true;
	public void checkInfo() {
		while(bool) {		
			try{
				System.out.println("주민번호 앞 6자리 입력 : ");
			
				num = sc.next();
				num = num.substring(0,2);
				System.out.println(num);
				int userNum = Integer.parseInt(num); // 문자열에서 앞 2자리 파싱 후 정수로 변환	
				
			 if(userNum>=90) {
				 System.out.println("가입 불가");
			 }else {
				 System.out.println("가입 완료");
				 bool=false;
			 }
        }
        catch (Exception e){
            sc.nextLine();
            System.out.println("'A,ㅁ,ㅋ'는 잘못 된 접근입니다. 다시 입력해주세요");
        }finally {
        	
        }
		
		
	}
	
	}
}


public class PraClass02 {
	public static void main(String[] args) {
		
		CheckInfo check = new CheckInfo();
		check.checkInfo();
			
		
		
		
	}

}
