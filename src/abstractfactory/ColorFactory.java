package abstractfactory;

public class ColorFactory extends AbstractFactory {
	public static final int RED = 0;
	public static final int GREEN = 1;
	public static final int BLUE = 2;
	
	@Override
	public Color getColor(int color) {
		switch( color ) {
			case RED : return new Red();
			case GREEN : return new Green();
			case BLUE : return new Blue();
			default: return null;
		}
	}

	@Override
	public Shape getShape(int shape) {
		return null;
	}

}
