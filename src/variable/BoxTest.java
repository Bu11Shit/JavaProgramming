package variable;

public class BoxTest
{
	int width;
	int height;
	int depth;
	
	public static void main(String[] args)
	{
		{
			/*
			int h = 5;
			int w = 5;
			int d = 5;
		
			// BoxTest box = new BoxTest();
		
			System.out.println("�ڽ��� ���Ǵ� = " + box.calcVolume(w, h, d) + " �Դϴ�.");
			 */
		}
		calcVolume calcVolume = new calcVolume();
		
		int w = 5;
		int h = 5;
		int d = 5;
		
		System.out.println("�ڽ��� ���Ǵ� = " + calcVolume.calcVolume(w, h, d) + " �Դϴ�.");
			
	}
	/*
	public int calcVolume(int w, int h, int d)
	{
		width = w;
		height = h;
		depth = d;
		
		int vol = width * height * depth;
		return vol;
	}
	*/



}
