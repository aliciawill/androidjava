package 그래픽Swing;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽 {

	public static void main(String[] args) {
		// 자바는 부품조립식 코드=> 객체지향형프로그래밍(OOP)
		// ctrl + shift + o: 자동import
		JFrame f = new JFrame(); //new는 복사의 의미
		f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE);
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "나를 눌러요를 눌렀군요.!");
			}
		});
		JButton b2 = new JButton();
		JButton b3 = new JButton();
//		String img = "sky.png";
		ImageIcon img = new ImageIcon("sky.png");
		b1.setText("나를 눌러요");
		b2.setText("나도 눌러요");
		b3.setIcon(img);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		
		f.setSize(1000, 500);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		//맨 아래에 두어야 한다.
		f.setVisible(true);
	}
}
