package set;

import java.util.HashSet;
import java.util.Iterator;

public class TestClass04 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("일");
		set.add("이");
		set.add("삼");
		
		System.out.println("set :" +set);
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			//반복문으로 hasNext가 true일때 조건으로 하고
			//hasNext -> 현 위치에서 다음 위치에 값이 있으면 true
			String s = it.next();
			//s에 it.next로 현위치에서 다음 위치에 있는 값을 저장하고
			System.out.println(s);
			//s로 출력을 하고 다시 올라가서 일,이,삼 까지 출력함
			//"삼"까지 출력하고 그 후로는 hasNext로 false가 나와서 
			// 반복문 끝
		}
	}

}
