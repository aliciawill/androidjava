package db연결;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 회원CRUDUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(500, 700);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 60));
		lblNewLabel.setBounds(27, 46, 124, 67);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setFont(new Font("굴림", Font.BOLD, 60));
		lblPw.setBounds(27, 132, 124, 67);
		f.getContentPane().add(lblPw);
		
		JLabel lblNewLabel_1_1 = new JLabel("NAME");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 55));
		lblNewLabel_1_1.setBounds(27, 226, 177, 67);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("TEL");
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.BOLD, 60));
		lblNewLabel_1_1_1.setBounds(27, 316, 124, 67);
		f.getContentPane().add(lblNewLabel_1_1_1);
		
		t1 = new JTextField();
		t1.setForeground(Color.RED);
		t1.setBackground(Color.YELLOW);
		t1.setFont(new Font("굴림", Font.BOLD, 45));
		t1.setBounds(226, 58, 246, 41);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setForeground(Color.RED);
		t2.setBackground(Color.YELLOW);
		t2.setFont(new Font("굴림", Font.BOLD, 45));
		t2.setColumns(10);
		t2.setBounds(226, 150, 246, 41);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setForeground(Color.RED);
		t3.setBackground(Color.YELLOW);
		t3.setFont(new Font("굴림", Font.BOLD, 45));
		t3.setColumns(10);
		t3.setBounds(226, 238, 246, 41);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setForeground(Color.RED);
		t4.setBackground(Color.YELLOW);
		t4.setFont(new Font("굴림", Font.BOLD, 45));
		t4.setColumns(10);
		t4.setBounds(226, 316, 246, 41);
		f.getContentPane().add(t4);
		
		JButton create = new JButton("회원가입");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//회원가입할 정보 4개의 입력값을 가지고 와서,
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				//db처리(MemberDAO), create()메서드 호출
				MemberDAO dao = new MemberDAO();
				try {
					dao.create(id, pw, name, tel);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		create.setFont(new Font("굴림", Font.BOLD, 25));
		create.setBounds(38, 438, 166, 83);
		f.getContentPane().add(create);
		
		JButton read = new JButton("회원검색");
		read.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();//id로 검색
				MemberDAO dao = new MemberDAO();
				try {
					int result = dao.read(id);//0이나 1이 리턴되어왔음.
					if (result == 1) { //검색결과가 있음.
						
					}else {//검색결과가 없음.
						t1.setText("없음");
						t2.setText("없음");
						t3.setText("없음");
						t4.setText("없음");
						t1.setBackground(Color.BLUE);
						t2.setBackground(Color.BLUE);
						t3.setBackground(Color.BLUE);
						t4.setBackground(Color.BLUE);
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		read.setFont(new Font("굴림", Font.BOLD, 25));
		read.setBounds(277, 438, 166, 83);
		f.getContentPane().add(read);
		
		JButton delete = new JButton("회원삭제");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		delete.setFont(new Font("굴림", Font.BOLD, 25));
		delete.setBounds(277, 543, 166, 83);
		f.getContentPane().add(delete);
		
		JButton update = new JButton("회원수정");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String tel = t4.getText();
				MemberDAO dao = new MemberDAO();
				try {
					dao.update(tel, id);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		update.setFont(new Font("굴림", Font.BOLD, 25));
		update.setBounds(38, 543, 166, 83);
		f.getContentPane().add(update);
		f.setVisible(true);
	}
}
