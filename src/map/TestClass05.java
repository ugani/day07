package map;

public class TestClass05 {

	public static void main(String[] args) {
		float fl = (float)1.11;
		int num = 100;
		String sNum = num+"";
		// 문자열과 숫자열을 더하면 문자열이 나오도록 num+ "" 큰따옴표를 추가해줌
		System.out.println("백 "+100);
		// 실행을 하면 백100 출력이됨 문자열과 정수가 만나 문자열이됨
		System.out.println(num+100);
		// 실행을 하면 num에 저장된 100 + 100이 된다.
		// "100"과 같은 숫자 형태의 문자열은 정수형으로 변환이 가능하지만
		// "안녕" 같은 문자열들은 숫자로 변환이 안됨
		int n = Integer.parseInt(sNum);
		System.out.println(n+123);
		

	}

}
