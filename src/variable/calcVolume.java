package variable;

/**
 * 이 프로그램은 부피를 구하는 프로그램입니다.
 * @author ICT - 10
 *
 */

public class calcVolume {
	int a;

	/**
	 * 부파를 부하는 생성자
	 * @param w
	 * @param h
	 * @param d
	 * @return
	 */
	public int calcVolume(int w, int h, int d)
	{
		// a는 반드시  0이여야한다.
		
		
		return w * h * d;
		
	}
	public void testPrint() {
		System.out.println("a의 값은 : " + a);
	}

}
