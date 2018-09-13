package abstractfactory;


public class ShapeFactory extends AbstractFactory {
	public static final int CIRCLE = 0;
	public static final int RECTANGLE = 1;
	public static final int SQUARE = 2;
	
	public Shape getShape(int shapeType) {
		switch ( shapeType ) {
			case CIRCLE : return new Circle();
			case RECTANGLE: return new Rectangle();
			case SQUARE: return new Square();
			default: return null;
		}
	}

	@Override
	public Color getColor(int color) {
		return null;
	}
}
