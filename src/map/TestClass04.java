package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class TestClass04 {

	public static void main(String[] args) {
//		HashMap<String, Integer> map = new HashMap<>();
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
//		LinkedHashMap -> 값을 저장한대로 순서대로 출력을 해줌
		map.put("선풍기", 100);
		map.put("자동차", 200);
		map.put("에어컨", 300);
		System.out.println(map);
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
