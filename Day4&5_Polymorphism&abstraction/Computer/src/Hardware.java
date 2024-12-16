
public interface Hardware {
	
	public void hardwareResources();
	
	public default void temp() {
		System.out.println("This is a static method in interface.");
	}

}
