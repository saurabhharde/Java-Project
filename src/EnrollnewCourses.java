import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EnrollnewCourses {
	public static List<EnrollCourse> enrollCourse = new ArrayList<>();
	public void enrollCourse(String currentid) {
		System.out.println();
		System.out.println("-----------------------Enroll New Course---------------------------");
		System.out.println();
		Scanner scanId= new Scanner(System.in);
		System.out.print("Enter course Id : ");
		String courseId= scanId.nextLine();
		String enrolldate="19-11-2022";
		double spenttime=0.0d;
		double completion=0.0d;
		System.out.println();
		if (CourseDataBase.courses.containsKey(courseId)) {
			enrollCourse.add(new EnrollCourse(currentid,StudentDataBase.studentData.get(currentid).getStudentName(),
							courseId,CourseDataBase.courses.get(courseId).getCoursename(),
							CourseDataBase.courses.get(courseId).getDuration(),
							enrolldate,spenttime,completion));	
			System.out.println("sucessfully add data in list");
		}
		
	}
	
	public void enrolledCourses(String currentId) {
		System.out.println();
		System.out.println("-----------------------Enrolled Courses---------------------------");
		System.out.println();
		System.out.println("Student ID : "+currentId);
		System.out.println("Student Name : "+StudentDataBase.studentData.get(currentId).getStudentName());
		System.out.println("------------------------------------------------------------------");
		System.out.printf("%-18s%-30s%-2s", "Course Id", "Course Name","Enrolled Date","\n");
		System.out.println();
		System.out.println("------------------------------------------------------------------");
		System.out.println();
		for (int i=0;i<enrollCourse.size();i++) {
			if(enrollCourse.get(i).getStudentid().equals(currentId)) {
				System.out.printf("%-18s%-30s%-2s",enrollCourse.get(i).getCourseid(),enrollCourse.get(i).getCoursename(),
						enrollCourse.get(i).getEnrolldate());
				System.out.println();
			}
		}
		System.out.println("------------------------------------------------------------------");			
	}

}
