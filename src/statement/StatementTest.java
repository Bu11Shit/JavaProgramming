package statement;

public class StatementTest {
	public static void main(String args[])
	{
		sumToTarget(1, 10);
		sumToTarget(1, 1000);
	}
	
	/*
	 * 시작값과 끝값을 넣으면 합을 출력하는 함수
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
