package statement;

public class StatementTest2 {
	public static void main(String[] args)
	{
		int num = 148;
		getDivisor(num);
	}
	private static void getDivisor(int num)
	{
		System.out.print(num + "의 약수는 ");
		for(int i = 1; i <=num; i++)
		{
			if(num % i == 0)
			{
				if(i != num)
				{
					System.out.print(i + ", ");
				}
				else
					System.out.print(i);
			}
			
		}
		
	}

}
