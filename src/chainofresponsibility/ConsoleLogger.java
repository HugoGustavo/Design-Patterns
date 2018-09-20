package chainofresponsibility;

public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level) {
		this.level = level;
	}
	@Override
	public void write(String message) {
		System.out.println("Standart Console::Logger: " + message);

	}

}
