package 클래스만들기;

public class 계산기사용가게 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		cal.plus();
		
		
		//Tv부품을 사용해서, 켜보기도 하고, 꺼보세요.!
		Tv tv1 = new Tv();
		tv1.on();
		Tv tv2 = new Tv();
		tv2.on();
		tv2.off();
	}

}
