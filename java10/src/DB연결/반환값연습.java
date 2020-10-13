package DB연결;

import java.util.Date;
import java.util.Random;

import javax.xml.crypto.Data;

public class 반환값연습 { //반환값연습사용.java
	
	public int add(int x, int y) {
		return x + y;
	}
	public double add(double x, int y) {
		return x + y;
	}
	public int[] add(int x) {
		int[] num = {1,2,x};
		return num;
	}
	public String add(String x, int y) {
		return x + y;
	}
	public Date add() {
		Date date = new Date();
		return date;
	}
	public boolean add(boolean x) {
		Random r = new Random();
		return r.nextBoolean();
	}
}
