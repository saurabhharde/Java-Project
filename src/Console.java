
import java.util.Scanner;
public class Console {
	Scanner scanner=new Scanner(System.in);
	private String currentuserid;
	private boolean userAuthentication;
	private StudentDataBase studentDataBase;
	private CourseDataBase courseDataBase;
	private static final String DISPLAY_COURSES="a";
    private static final String VIEW_ENROLL_COURSE="b";
    private static final String ENROLL_IN_COURSE="c";
    private static final String CLOCK_IN_TIME="d";
    private static final String VIEW_SUMMARY="e";
    private static final String Logout="f";
    
    public Console() {
    	userAuthentication =false;
    	studentDataBase= new StudentDataBase();
    	studentDataBase.studentData();
    	courseDataBase= new CourseDataBase();
    	courseDataBase.Courses();
    }
    
    public void run() {
    	while(true) {
    		while(!userAuthentication) {
    			System.out.println("\n-------Welcome-------");
    			authenticatedUser();
    		}
    		mainMenu();
    		userAuthentication=false;
    	}
    }

	private void mainMenu() {
		
        Boolean userExited=false;
        while(! userExited) {
            String mainMenuSelect=DisplayMainMenu();
            switch(mainMenuSelect) {
            case DISPLAY_COURSES:
            	courseDataBase.DisplyCourses();
                break;
                
            case VIEW_ENROLL_COURSE:
            	
            	EnrollnewCourses enrollNewCourses=new EnrollnewCourses();
            	enrollNewCourses.enrolledCourses(currentuserid);
                break;
                
             case ENROLL_IN_COURSE:
            	 EnrollnewCourses enrollnewCourses=new EnrollnewCourses();
            	 enrollnewCourses.enrollCourse(currentuserid);
            	 break;
            	 
             case CLOCK_IN_TIME:
            	 ClockinTime clockintime=new ClockinTime();
            	 clockintime.ClockInTime(currentuserid);
             break;
             
             case VIEW_SUMMARY:
            	 ClockinTime clockIntime=new ClockinTime();
            	 clockIntime.Summery(currentuserid);
                 break;
             case Logout:
                 userExited=true;
                 
            }
        }
    }
	
	public void authenticatedUser() {
		System.out.print("Enter your user ID : ");
		String userID=scanner.nextLine();
		System.out.println();
		System.out.print("Enter your Password : ");
		String password=scanner.nextLine();
		
		userAuthentication=studentDataBase.Authentication(userID, password);
		if (userAuthentication) {
			currentuserid=userID;
		}
		else {
			System.out.println("\n You have entered wrong username/password");
		}
		
	}
	
	public String DisplayMainMenu() {
		
		System.out.println("\n-------Main Menu-------");
		System.out.println("a - Display all courses");
		System.out.println("b - View enrolled courses");
		System.out.println("c - Enroll in a new Course");
		System.out.println("d - Clock-in time");
		System.out.println("e - View Summery");
		System.out.println("f - Logout");
		System.out.print("Enter above option : ");
		return scanner.nextLine();
	}
	
	public static void main(String[] args) {
		Console console = new Console();
		console.run();
	}

}
