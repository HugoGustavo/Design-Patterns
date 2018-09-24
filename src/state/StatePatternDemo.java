package state;

public class StatePatternDemo {

	public static void main(String[] args) {
		Context context = new Context();
		
		State startState = new StartState();
		context.setState(startState);
		context.doAction();
		
		State stopState = new StopState();
		context.setState(stopState);
		context.doAction();
	}

}
