package dataacessobject;

public class DaoPatternDemo {
	private static StudentDao studentDao = new StudentDaoImpl();
	
	public static void main(String[] args) {
		for ( Student student : studentDao.getAllStudents() ) {
			System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
		}
		
		Student student = studentDao.getAllStudents().get(0);
		student.setName("Michael");
		studentDao.updateStudent(student);
		
		student = studentDao.getStudent(0);
		System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
	}

}
