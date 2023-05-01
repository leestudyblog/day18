package gui;
//java Fx & GUI

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainClass01 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("lable example");
		Container con = frame.getContentPane(); // 컨테이너 생성
		
		JLabel lable = new JLabel("testLable");//라벨 생성 및 실행
		
		lable.setText("text Change");//텍스트 변경
		
		Font font  = new Font(null, Font.BOLD,32);//  (글씨체,스타일,사이즈)
		lable.setFont(font);
		
		con.add(lable);//컨테이너에 라벨 추가
		
		
		frame.setLocation(100,200);//위치설정
		
		frame.setPreferredSize(new Dimension(500,200));//프레임 사이즈 설정
		frame.pack();//기본 프레임 사이즈 변경
		
		frame.setVisible(true); // 프레임 실행
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프레임 종료 + 프로그램 종료
		
		for (int i=0; ;i++) {
			lable.setText(i+"변경");
		}
		
		
	}

}
