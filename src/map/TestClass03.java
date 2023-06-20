package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestClass03 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("이름", "홍길동");
		map.put("나이", "20");
		map.put("주소", "산골짜기");
		System.out.println("map :" +map);
		System.out.println();
		
		System.out.println(map.keySet());
		System.out.println();
		//map이 가지고 있는 키값들만 출력을 해줌
		//괄호 안에 키값을 넣어주면 그 키값만 출력해줌
		System.out.println(map.values());
		System.out.println();
		//map이 가지고 있는 값들만 출력을 해줌
		//괄호 안에 저장된 값을 넣어주면 그 값만 출력해줌
		
		Set<String> set = map.keySet(); //★
		//Set<E> 자바 유틸 실행해줘야함
		//keyset으로 값을 저장 할 때는 Set으로 값을 저장해주고
		System.out.println("set :" +set);
		System.out.println();
		
		Iterator<String> it = set.iterator();
		//Iterator로 반복자를 설정해주고
		while(it.hasNext()) {
		//반복문과 it.next로 다음 값을 계속 출력하도록 반복함
			String key = it.next();
			System.out.println(key + ": "+map.get(key));
		}
		
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
	}

}
