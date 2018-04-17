
public class StaticMain {

	public static void main(String[] args) {
		Student mark = new Student();
		System.out.println(mark.getNoOfStudents());
		
		Student tom = new Student();
		System.out.println(tom.getNoOfStudents());
		
		System.out.println();
		System.out.println(Student.getNoOfStudents());
		
		System.out.println();
		System.out.println(mark.getAge());
		System.out.println(mark.getName());
		
		System.out.println();
		System.out.println(tom.getName());
		System.out.println(tom.getAge());
		
		
		
		
		

	}

}
