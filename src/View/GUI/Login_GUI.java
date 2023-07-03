package View.GUI;

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login_GUI extends JFrame implements ActionListener, KeyListener{
	JButton btn1;
	JButton btn2;
	JTextField txt1; //아이디
	JTextField txt2; //비번
	
	Login_GUI() {
//		Frame
		super("");
		setBounds(100, 100, 500, 500);

// 		Panel
		JPanel panel = new JPanel(); // 패널생성

		panel.setLayout(null);

// 		Component
		btn1 = new JButton("로그인");
		btn2 = new JButton("취소");
		txt1 = new JTextField("ID : ");
		txt2 = new JTextField("PW : ");


// 		Positioning
		btn1.setBounds(110, 250, 120, 40); // 로그인
		btn2.setBounds(250, 250, 120, 40); // 취소
		txt1.setBounds(60,100,350,40);	// 아이디
		txt2.setBounds(60,160,350,40);	// 비번

//		Event처리
	}

}
