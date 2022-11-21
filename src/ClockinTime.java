import java.util.Scanner;

public class ClockinTime {
	public void ClockInTime(String currentId) {
		System.out.println();
		System.out.println("---------------- Clock In Time-----------------");
		System.out.println();
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter Course Id : ");
		System.out.println();
		String C_Id=scanner.nextLine();
		
		for (int i=0;i<EnrollnewCourses.enrollCourse.size();i++) {
			if (EnrollnewCourses.enrollCourse.get(i).getCourseid().equals(C_Id) && 
				EnrollnewCourses.enrollCourse.get(i).getStudentid().equals(currentId)){
				Scanner spenttime= new Scanner(System.in);
				System.out.print("Enter time spent in Course "+C_Id+" : ");
			try{	double timeSpent=spenttime.nextInt();
					double actualtimespent=timeSpent+EnrollnewCourses.enrollCourse.get(i).getSpenttime();
				if (actualtimespent<=CourseDataBase.courses.get(C_Id).getDuration()) {
					
					double completion=(actualtimespent*100)/CourseDataBase.courses.get(C_Id).getDuration();
					EnrollnewCourses.enrollCourse.set(i, new EnrollCourse(currentId,StudentDataBase.studentData.get(currentId).getStudentName(),
							C_Id,CourseDataBase.courses.get(C_Id).getCoursename(),
							CourseDataBase.courses.get(C_Id).getDuration(),
							EnrollnewCourses.enrollCourse.get(i).getEnrolldate(),actualtimespent,completion));
					System.out.println("sucessfully add spent time in course");
				}
				else {
					System.out.println();
					System.out.println("Timespent more than Course duration time");
					break;
				}
				
			}
			catch(Exception e) {
					System.out.println("Enter time in hours");
				}
			}     
		}	
	}
	
	public void Summery(String currentId) {
		System.out.println();
		System.out.println("--------------------------Student Summary----------------------------");
		System.out.println();
		System.out.println("Student ID : "+currentId);
		System.out.println("S tudent Name : "+StudentDataBase.studentData.get(currentId).getStudentName());
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.printf("%-18s%-30s%-20s%-20s%-2s", "Course Id", "Course Name", "Duration","TimeSpent","Completion %","\n");
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println();
		for (int i=0;i<EnrollnewCourses.enrollCourse.size();i++) {
			if (EnrollnewCourses.enrollCourse.get(i).getStudentid().equals(currentId)) {
				System.out.printf("%-18s%-30s%-20s%-20s%-2s",EnrollnewCourses.enrollCourse.get(i).getCourseid(),
						EnrollnewCourses.enrollCourse.get(i).getCoursename(),EnrollnewCourses.enrollCourse.get(i).getDuration(),
						EnrollnewCourses.enrollCourse.get(i).getSpenttime(),EnrollnewCourses.enrollCourse.get(i).getCompletion());
				System.out.print("\n");
			}
		}
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println();		
	}	
}
