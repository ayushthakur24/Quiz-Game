package Bean;

import java.util.List;

public class Users {
List< User > students;


public List<User> getStudents() {
	return students;
}


public void setStudents(List<User> students) {
	this.students = students;
}


/**
 * @param students
 */
public Users(List<User> students) {
	super();
	this.students = students;
}


/**
 * 
 */
public Users() {
	super();
	// TODO Auto-generated constructor stub
}

}
