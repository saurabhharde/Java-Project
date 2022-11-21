
public class Course {

	private String coursename;
	private String level;
	private int duration;

	public Course(String coursename, String level, int duration) {
		this.coursename=coursename;
		this.level=level;
		this.duration=duration;
	}

	public String getCoursename() {
		return coursename;
	}

	public String getLevel() {
		return level;
	}

	public int getDuration() {
		return duration;
	}

	
	
}
