package movie;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 패널독립 extends JPanel {

	public static void main(String[] args) {
		패널독립 name = new 패널독립();
	}

	public 패널독립() {
		setSize(500, 500);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(btnNewButton);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		add(tabbedPane);
	}
}
