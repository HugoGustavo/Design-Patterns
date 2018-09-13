package abstractfactory;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		// Get Shape Factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryProducer.SHAPE);
		// Get an object of Shape Circle
		Shape shape1 = shapeFactory.getShape(ShapeFactory.CIRCLE);
		shape1.draw();
		// Get an object of Shape Rectangle
		Shape shape2 = shapeFactory.getShape(ShapeFactory.RECTANGLE);
		shape2.draw();
		// Get an object of Shape Square
		Shape shape3 = shapeFactory.getShape(ShapeFactory.SQUARE);
		shape3.draw();
		
		// Get Color Factory
		AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryProducer.COLOR);
		// Get an object of Red
		Color color1 = colorFactory.getColor(ColorFactory.RED);
		color1.fill();
		// Get an object of Green
		Color color2 = colorFactory.getColor(ColorFactory.GREEN);
		color2.fill();
		// Get an object of Blue
		Color color3 = colorFactory.getColor(ColorFactory.BLUE);
		color3.fill();
	}

}
