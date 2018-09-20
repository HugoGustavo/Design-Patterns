package iterator;

public class IteratorPatternDemo {

	public static void main(String[] args) {
		NameRepository namesRepository = new NameRepository();
		
		for ( Iterator iter = namesRepository.getIterator(); iter.hashNext(); ) {
			String name = (String) iter.next();
			System.out.println("Name: " + name);
		}
	}

}
