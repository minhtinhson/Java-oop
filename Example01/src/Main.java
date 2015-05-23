
public class Main {

	public static void main(String[] args) {
	CRectangle rect = new CRectangle();
	{
		CRectangle rect1 = new CRectangle();
		CRectangle rectb = new CRectangle();
		rect1.setValues(3, 4);
		rect1.setValues(5, 6);
		
		System.out.println("rect a:"+rect1.area());
		System.out.println("rect a:"+rectb.area());
		
	}
	}

}
