package stream;

interface A{
	default void show() {
		System.out.println("A default");
	}
}

interface B{
	default void show() {
		System.out.println("B default");
	}
}

public class Check implements A,B{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		A.super.show();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
