package DB연결;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Test {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.setLayout(new FlowLayout());
		ButtonGroup g = new ButtonGroup();
		JRadioButton r1 = new JRadioButton("남");
		JRadioButton r2 = new JRadioButton("여");
		g.add(r1);
		g.add(r2);
		f.add(r1);
		f.add(r2);
		r1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getActionCommand());
			}
		});
		r2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getActionCommand());
			}
		});
		f.setVisible(true);
	}

}
