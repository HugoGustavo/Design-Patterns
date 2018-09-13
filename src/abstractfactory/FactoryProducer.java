package abstractfactory;

public class FactoryProducer {
	public static final int SHAPE = 0;
	public static final int COLOR = 1;
	
	public static AbstractFactory getFactory(int choice) {
		switch ( choice ) {
			case SHAPE : return new ShapeFactory();
			case COLOR : return new ColorFactory();
			default: return null;		
		}
	}
}
