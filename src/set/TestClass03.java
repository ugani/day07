package set;

import java.util.ArrayList;
import java.util.Iterator;

public class TestClass03 {

	public static void main(String[] args) {
		/*
		 Iterator - 반복자
		 - 컬렉션 프레임워크들을 순서 있는 배열형식으로 변환해준다.
		 */
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("일"); 
		arr.add("이");
		arr.add("삼");
		System.out.println("arr :" +arr);
		
		Iterator<String> it = arr.iterator();
		/*
		 hasNext : 다음 위치의 값이 있으면 true, 없으면 false
		 next : 다음 위치로 이동하며 해당 위치의 값을 얻어오는 기능
		 */
		
		System.out.println(it.hasNext());
		//현재 위치에서 다음 위치에 값이 있으면 true, 없으면 false
		// 일 다음에 이가 저장되어 있어서 true 출력
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		//현재 위치에서 다음 위치에 있는 "일"을 출력하고
		//next를 세번 사용하면 "삼"끼지 출력함
		//"삼"이후로는 데이터가 없어서 next를 또 실행하면 에러발생
		System.out.println(it.hasNext());
		//next로 "삼"까지 출력하고 hasNext로 다음 위치의 값을 확인하면
		// 값이 없어서 false를 출력
	}

}
