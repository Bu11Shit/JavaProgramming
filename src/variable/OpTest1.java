package variable;

public class OpTest1 {
	public static void main (String[] args) {
		int x = 10;
		int y = 11;
		int z = 11;
		
		System.out.println("x > y 의 비교 결과 : " + (x > y));
		System.out.println("x < y 의 비교 결과 : " + (x < y));
		System.out.println("x< 20 의 비교 결과 : " + (x < 20));
		
		System.out.println("x == y 의 비교 결과 : " + (x == y));
		System.out.println("x == 10 의 비교 결과 : " + (x == 10));
		System.out.println("x == z 의 비교 결과 : " + (x == z));
		
		System.out.println("x != y 의 비교 결과 : " + (x != y));
		System.out.println("x != 13 의 비교 결과 : " + (x != 13));
		
		System.out.println("x <= y 의 비교 결과 : " + (x <= y));
		System.out.println("x >= y 의 비교 결과 : " + (x >= y));
	}

}
