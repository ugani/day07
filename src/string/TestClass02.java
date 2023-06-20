package string;

public class TestClass02 {

	public static void main(String[] args) {
		String str = "test";
		System.out.println(str);
		
		char ch = str.charAt(1);
		//ch에 charAt를 사용하여 str에 저장된 test 중 1에 저장된 e를 ch에 저장 
		System.out.println(str.charAt(0));
		//charAt를 사용하여 str에 저장된 test 중 0에 저장된 t를 출력
		System.out.println(ch);
		//ch에 저장되어있는 e를 출력
		
		System.out.println(ch == 'c');
		//ch와 'c'를 비교함, ch에는 e가 저장되어있으므로 false
	}

}
