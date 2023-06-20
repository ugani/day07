package string;

public class TestClass01 {

	public static void main(String[] args) {
		String str;
		String str2 = new String();
		
		String str3 = "test";
		String str4 = new String("java programming");
				
		String s = str4.toUpperCase();
		//str4에 저장된 문자열을 대문자로 바꿔서 s에 저장 후 대문자로 출력을함
		System.out.println(s);
		System.out.println( str4);
		
		//수강하는 과목 저장 : Java, java, JAVA
		str3 = "JAVA";
		if(str3.toLowerCase().equals("java")) {
			System.out.println("수강 과목은 자바군요");
			//str3에 저장된 대문자 자바를 소문자로 바꾼 후
			// 소문자 자바와 비교함
			
		}

	}

}
