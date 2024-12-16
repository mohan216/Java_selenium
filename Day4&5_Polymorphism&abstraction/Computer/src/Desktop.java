
public class Desktop implements Hardware, Software{
	
	@Override
	public void hardwareResources() {
		System.out.println("This is hardware resources in Desktop.");		
	}
	
	@Override
	public void softwareResources() {
		System.out.println("This is software resources in Desktop.");	
	}
	
	public static void main(String[] args) {
		Desktop a = new Desktop();
		a.hardwareResources();
		a.softwareResources();
		a.temp();
	}

}
