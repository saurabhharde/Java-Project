
public class StudentAccount {
	private String studentname;
	private String passwoed;
	
	public StudentAccount() {};
	public StudentAccount( String theStudentName, String theLoginPassword) {
		studentname = theStudentName;
		passwoed = theLoginPassword;
	}
	

	
	public String getStudentName() {
		return studentname;
	}
	
	public String getStudentPasswoed() {
		return passwoed;
	}

}
