package 그래픽Swing;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JPanel;

public class 계산기 {

	public static void main(String[] args) {
		//프레임1
		JFrame f = new JFrame();
		f.setSize(1000, 1000);
		f.setLayout(new FlowLayout());
		for (int i = 0; i < 10; i++) {
			JPanel panel = new JPanel();
			panel.setBackground(Color.yellow);
			FlowLayout flowLayout = (FlowLayout) panel.getLayout();
			flowLayout.setVgap(50);
			flowLayout.setHgap(50);
			f.getContentPane().add(panel);
			JButton btnNewButton = new JButton("New button==>" + i);
			ImageIcon icon = new ImageIcon("sky.png");
			btnNewButton.setIcon(icon);
			panel.add(btnNewButton);
			btnNewButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(panel, btnNewButton.getText());
				}
			});
			
			JButton btnNewButton_1 = new JButton("New button2==>" + i);
			panel.add(btnNewButton_1);
			btnNewButton_1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(panel, btnNewButton_1.getText());
				}
			});
		}
		
		f.setVisible(true);
	}//main

}//class
