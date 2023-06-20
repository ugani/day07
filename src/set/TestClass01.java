package set;

import java.util.ArrayList;
import java.util.HashSet;

public class TestClass01 {

	public static void main(String[] args) {
		/*
		 Set - HashSet
		 - 순서를 유지하지 않는다.
		 - index를 사용 할 수 없다.반복자를 사용한다.
		 - 데이터의 중복을 허용하지 않는다.
		 - List 처리속도가 빠르다.
		 - set은 기본 16개의 배열을 만든다.
		 - 리스트는 0번째부터 추가하는데 set은 아무 공간에 추가함
		 */
		
		HashSet<String> set = new HashSet<>();
		set.add("라면");
		set.add("순대");
		set.add("김밥");
		set.add("라면");
		
		System.out.println("set :" +set);
		//set은 중복X 순서대로 저장되지 않음
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("라면");
		arr.add("순대");
		arr.add("김밥");
		arr.add("라면");
		System.out.println("arr :"+arr);

	}

}
