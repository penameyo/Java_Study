package Chapter01;

import java.util.ArrayList;
import java.util.List;

public class SampleClass {
	//전역변수
	static int a; //class 전체에서 쓸 수 있는 변수
	public static void main(String[] args) {
		List<String> List= new ArrayList();

		int abc =123; //변수 선언 및 초기화
		int result = abc + 123;
		System.out.println(a);
	}
}