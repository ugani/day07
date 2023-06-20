package map;

import java.util.HashMap;

public class TestClass02 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		//첫 글자가 대문자면 클래스 형식의 자료형 
		//int의 클래스형식 자료형 -> Integer
		map.put("num", 100);
		map.put("age", 20);
		System.out.println("map : "+map);
		
		int num = map.get("age");
		System.out.println("num :"+num);
		System.out.println("map.get(num) :"+map.get("num"));
		
		System.out.println(map.containsKey("age"));
		System.out.println(map.containsKey(100));
		//containkey --> 해당하는 키가 있으면 true, 없으면 false
		//containvalue --> 해당하는 값이 있으면 true, 없으면 false
		
		map.put("age", 100); //key 중복 안됨!!
		//이름이 동일한 키를 저장 할 순 없지만
		//동일한 값은 저장이 가능함
		System.out.println("map :" +map);
		//출력을 하면 age는 중복으로 저장이 안되고
		//20에서 100으로 값을 변경해서 저장 가능
		
		map.remove("age");
		System.out.println("remove :" +map);
	}

}
