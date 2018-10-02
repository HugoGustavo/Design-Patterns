package frontcontroller;

public class Dispatcher {
	private StudentView studentView = new StudentView();
	private HomeView homeView = new HomeView();
	
	public void dispatch(String request) {
		if ( request.equalsIgnoreCase("STUDENT") )
			studentView.show();
		else
			homeView.show();
	}
}
