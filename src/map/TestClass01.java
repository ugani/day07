package map;

import java.util.HashMap;

public class TestClass01 {

	public static void main(String[] args) {
		/*
		 Map - HashMap
		 - key, value 형식으로 만들어진다.
		 - key의 중복은 허용되지 않으며 value 중복은 가능하다.
		 */
		
		HashMap<String, String> map = new HashMap<>();
		map.put("num", "100");
		//num에 100을 저장
		map.put("name", "홍길동");
		//name에 홍길동 저장
		System.out.println("map :"+map);
		System.out.println(map.get("num"));
		//변수 이름과 같은 num에 저장된 100을 출력함
		System.out.println(map.get("name"));
		//변수 이름과 같은 name에 저장된 홍길동을 출력함
		System.out.println(map.get("없는 키"));
		//없는 값이라면 null을 출력함
		
		
		
		

	}

}
