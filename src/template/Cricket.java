package template;

public class Cricket extends Game {

	@Override
	public void initialize() {
		System.out.println("Cricket Game Initialized! Start play");

	}

	@Override
	public void startPlay() {
		System.out.println("Cricket Game Started. Enjoy the game!");

	}

	@Override
	public void endPlay() {
		System.out.println("Cricket Game Finished!");

	}

}
