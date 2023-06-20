package random;

import java.util.Random;

public class TestClass01 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
		System.out.println(Math.random());
		}
		System.out.println("---------------");
		for( int i=0; i<5; i++) {
			double ran = Math.random()*3;
			//0.0000 ~ 0.9999 사이의 수
			// *3(곱하기 3)
			// 0.000 ~ 2.999
			//원래 위와 같이 소수 값이 나오는데
			// (int)(0.000~2.999) => 0~2
			// 형변환으로 소수를 정수로 바꿈
			System.out.println((int)ran);
		}
		System.out.println("--------------------");
		Random r = new Random();
		//Random이라는 기능이 따로 있음
		for(int i=0; i<6; i++) {
			int num = r.nextInt(45); //1~46
			System.out.println(num+1);
		}
	}

}
