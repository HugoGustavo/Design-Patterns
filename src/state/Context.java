package state;

public class Context {
	private State state;
	
	public Context() {
		this.state = null;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void doAction() {
		this.state.doAction(this);
		System.out.println(state);
	}
}
