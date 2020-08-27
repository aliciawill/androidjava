package movie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class 프레임교체 extends JFrame {

	public static void main(String[] args) {
		프레임교체 name = new 프레임교체();
	}

	public 프레임교체() {
		setSize(500, 500);
		setLayout(null);
		JButton b1 = new JButton("1번");
		JButton b2 = new JButton("2번");
		JButton b3 = new JButton("3번");
		b1.setBounds(50, 50, 50, 50);
		b2.setBounds(100, 50, 50, 50);
		b3.setBounds(150, 50, 50, 50);
		add(b1);
		add(b2);
		add(b3);

		JPanel p1 = new JPanel();
		p1.add(new JButton("나는 1번 패널"));
		JPanel p2 = new JPanel();
		p2.add(new JButton("나는 2번 패널"));
		JPanel p3 = new JPanel();
		p3.add(new JButton("나는 3번 패널"));
		p1.setBounds(100, 100, 300, 300);
		p2.setBounds(100, 100, 300, 300);
		p2.setVisible(false);
		p3.setBounds(100, 100, 300, 300);
		p3.setVisible(false);
		add(p1);
		add(p2);
		add(p3);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				p1.setVisible(true);
				p2.setVisible(false);
				p3.setVisible(false);
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				p2.setVisible(true);
				p1.setVisible(false);
				p3.setVisible(false);
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				p3.setVisible(true);
				p2.setVisible(false);
				p1.setVisible(false);
			}
		});
		setVisible(true);
	}

}
