package statement;

public class Loopmoon {
	public static void main(String arg[])
	{
		// do while 문
//		int a = 0;
//		int sum = 0;
//		do {
//			sum+=a;
//			System.out.println("Sum = " + sum);
//			a++;
//		}while(a>5);
		
		
		// while 문
//		int a=0;
//		int sum=0;
//		
//		while(a < 5) {
//			sum +=a;
//			System.out.println("sum =" + sum);
//			a++;
		
		// for 문
		int sum=0;
		for(int i=0; i<5; i+=2) {
			sum+=i;
			System.out.println("합은 " + sum);
		
		}
		
	}

}
