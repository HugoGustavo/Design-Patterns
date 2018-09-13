package factory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1 = shapeFactory.getShape(ShapeFactory.CIRCLE);
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape(ShapeFactory.RECTANGLE);
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape(ShapeFactory.SQUARE);
		shape3.draw();

	}

}
