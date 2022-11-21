
class EnrollCourse{
	private String studentid;
	private String studentname;
	private String courseid;
	private String coursename;	
	private int duration;
	private String enrolldate;
	private double spenttime;
	private double completion;
	public EnrollCourse(String studentid, String studentname, String courseid, String coursename,
							int duration,String enrolldate, double spenttime,double completion) {
		this.studentid=studentid;
		this.studentname=studentname;
		this.courseid=courseid;
		this.coursename=coursename;
		this.duration=duration;
		this.enrolldate=enrolldate;
		this.spenttime=spenttime;
		this.completion=completion;
	}
	public String getStudentid() {
		return studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public String getCourseid() {
		return courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public int getDuration() {
		return duration;
	}
	public String getEnrolldate() {
		return enrolldate;
	}
	public double getSpenttime() {
		return spenttime;
	}
	public double getCompletion() {
		return completion;
	}
	
}