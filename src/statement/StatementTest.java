package statement;

public class StatementTest {
	public static void main(String args[])
	{
		sumToTarget(1, 10);
		sumToTarget(1, 1000);
	}
	
	/*
	 * ���۰��� ������ ������ ���� ����ϴ� �Լ�
	 * */
	private static void sumToTarget(int start, int end)
	{
		int sum = 0;
		for(int i = start; i <= end; i++)
		{
			sum+=i;
		}
		System.out.println(sum);
		
		
	}

}
