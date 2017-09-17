import java.util.*;

class Student {
	public String name, lastName;
	public Student (String studentName, String studentLastName){
		name=studentName;
		lastName=studentLastName;
	}
}
public class Application {
	public static void main(String args[]){
		Set<Student> students = new HashSet<Student>();
		List<Integer> results = new ArrayList<Integer>();
		Random rand = new Random();
		float sum=0;

		students.add (new Student("Ivan", "Ivanov"));
		students.add (new Student("Petr", "Petrov"));
		students.add (new Student("Pavel", "Vasiliev"));
		students.add (new Student("Anna", "Kot"));
		students.add (new Student("Olga", "Los"));

		for (int i=0; i<students.size(); i++)
			results.add (rand.nextInt(6));

		for (int i: results)
			sum+= i;

		System.out.println("Sum of evaluations: " + sum);
		System.out.println("Average evaluation: " + sum/results.size());
	}
}
