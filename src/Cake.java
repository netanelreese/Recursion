
public class Cake {
	private int bites = 16;
	
	public Cake() {
		//FIXME ???
	}
	public void takeABite() {
		--bites;
		System.out.println("~tasty~");
	}
	public boolean isEmpty() {
		return bites == 0;
	}
}
