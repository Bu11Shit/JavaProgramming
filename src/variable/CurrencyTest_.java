package variable;

public class CurrencyTest_ {
	
	public static void main(String[] args) {
		int won_ = 354000;
		int rate_ = 960;
		float dollar_;
		
		dollar_ = won_/rate_;
		System.out.println(won_ + "���� ���� �޷��� : " + dollar_ + "�޷�" );

		dollar_ = (float)won_ / (float)rate_;
		System.out.println(won_ + "���� ���� �޷��� : " + dollar_ + "�޷�" );

		dollar_ = (float)won_ / rate_;
		System.out.println(won_ + "���� ���� �޷��� : " + dollar_ + "�޷�" );

		won_ = (int)dollar_ * rate_;
		System.out.println(won_ + "���� ���� �޷��� : " + dollar_ + "�޷�" );
		won_ = (int)(dollar_ * rate_);
		System.out.println(won_ + "���� ���� �޷��� : " + dollar_ + "�޷�" );

	}

}
