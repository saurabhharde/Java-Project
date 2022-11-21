import java.util.HashMap;
import java.util.Map;
public class StudentDataBase {

	public static Map<String,StudentAccount> studentData=new HashMap<>();
	public void studentData(){
		studentData.put("S101", new StudentAccount("John", "abcd"));
		studentData.put("S102", new StudentAccount("Daniel", "mnop"));
	}
	
	public boolean Authentication (String userId, String passWord) {
		if (studentData.containsKey(userId)){
			if(studentData.get(userId).getStudentPasswoed().equals(passWord)) {
				System.out.println("sussecfully Login");
				return true;
			}
		}return false;
	}
	
}
