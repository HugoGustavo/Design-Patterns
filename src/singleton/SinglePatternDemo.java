package singleton;

public class SinglePatternDemo {

	public static void main(String[] args) {
		// illegal construct
		// Compile Time Error: The constructor Single Object() is not visible
		// SingleObject object = new SingleObject();
		
		// Get the only object available
		SingleObject object = SingleObject.getInstance();
		
		object.showMessage();
	}

}
