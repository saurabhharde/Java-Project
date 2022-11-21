import java.util.Map;
import java.util.TreeMap;
public class CourseDataBase {
	public static Map<String, Course> courses=new TreeMap<>();
	
	public void Courses() {
		courses.put("C1", new Course("Java basics","Low",3));
		courses.put("C2", new Course("Advanced Java Tutorial","Medium",4));
		courses.put("C3", new Course("SQL developers course","Medium",4));
		courses.put("C4", new Course("DevOps Tutorial","High",5));
	
	}	
	public void DisplyCourses() {
		System.out.println();
		System.out.println("*********************----------Available Courses----------**********************");
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		System.out.printf("%-18s%-30s%-20s%-2s", "Course Id", "Name", "Difficulty Level", "Duration","\n");
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		for (Map.Entry<String,Course> entry : CourseDataBase.courses.entrySet()) {
			
            System.out.printf( "%-18s%-30s%-20s%-2s",entry.getKey(),entry.getValue().getCoursename(),
            					entry.getValue().getLevel(),entry.getValue().getDuration());
            System.out.print("\n");

		}
		System.out.println("--------------------------------------------------------------------------------");
	}
}
