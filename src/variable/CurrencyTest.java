package variable;

public class CurrencyTest
{
	public static void main(String[] args)
	{
		int won = 354000;
		int rate = 960;
		float dollar;
		
		dollar = won / rate; //정수만 리턴한다
		System.out.println(won + "원 에 대한 달러는 : " + dollar + " 달러");
		
		dollar = (float)won / (float)rate;
		System.out.println(won + "원 에 대한 달러는 : " + dollar + " 달러");
		dollar = (float) won/rate;
		System.out.println(won + "원 에 대한 달러는 : " + dollar + " 달러");

		// won = dollar * rate;
		won = (int)dollar * rate;
		System.out.println(won + "원 에 대한 달러는 : " + dollar + " 달러");

		won = (int)(dollar * rate);
		System.out.println(won + "원 에 대한 달러는 : " + dollar + " 달러");

		
	}

}
