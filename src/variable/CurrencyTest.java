package variable;

public class CurrencyTest
{
	public static void main(String[] args)
	{
		int won = 354000;
		int rate = 960;
		float dollar;
		
		dollar = won / rate; //������ �����Ѵ�
		System.out.println(won + "�� �� ���� �޷��� : " + dollar + " �޷�");
		
		dollar = (float)won / (float)rate;
		System.out.println(won + "�� �� ���� �޷��� : " + dollar + " �޷�");
		dollar = (float) won/rate;
		System.out.println(won + "�� �� ���� �޷��� : " + dollar + " �޷�");

		// won = dollar * rate;
		won = (int)dollar * rate;
		System.out.println(won + "�� �� ���� �޷��� : " + dollar + " �޷�");

		won = (int)(dollar * rate);
		System.out.println(won + "�� �� ���� �޷��� : " + dollar + " �޷�");

		
	}

}
