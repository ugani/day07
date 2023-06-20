package string;

import java.util.Scanner;

public class TestClass03 {

	public static void main(String[] args) {
		String str = "test";
		
		System.out.println("문자열 입력:");
		String str2 = "test  ";
		
		System.out.println(str+".");
		System.out.println(str2+".");
		//trim을 사용하지 않으면 str2에 저장한대로 공백이 띄어져서 나옴
		System.out.println(str2.trim()+".");
		//trim은 양쪽에 있는 공백을 없애주는 기능
		
		System.out.println("str == str2 :"+str.equals(str2) );
		//이퀄스로 비교했을 때 트림을 사용하지 않으면 공백이 있기 때문에 false 출력
		System.out.println("str == str2 :"+str.equals(str2.trim()) );
		//비교를 했을 때 트림을 사용했으므로 공백이 사라져서 true 출력
		
		String addr = "052154/서울/종로구/단성사4층";
		String[] s_addr = addr.split("/");
		//split을 사용해서 공백을 기준으로 저장된 값을 잘라줘서 배열에 저장함!!
		//보통은 /(슬러시)를 사용해서 구분을 많이함!
		for(int i=0; i<s_addr.length; i++) {
			System.out.println(s_addr[i]);
		}
		System.out.println();
		
		String result = addr.replace("/", ":");
		System.out.println(result);
		//변경할 문자와 새로운 문자를 지정해서 string형식으로 값을 저장함
		// 기존에 저장된 값 "/"를 " : "으로 바꿔서 저장함
		
		result = "010-1234-1234";
		System.out.println(result.replace("-", "_"));
	}

}
