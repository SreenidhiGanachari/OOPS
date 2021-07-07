
public class Encapsulation {

	private String name;
	private int Registrationno;
	private String Course;
	private int Year;
	
	public String getName() {
		return name;
	}
	
	public int getRegistrationno() {
		return Registrationno;
	}
	public String getCourse() {
		return Course;
	}
	public int getYear() {
		return Year;
	}
	public void setName( String newName) {
	      name = newName;
	   }

	   public void setRegistrationno(int newRegistrationno) {
	      Registrationno = newRegistrationno;
	   }

	   public void setCourse( String newCourse) {
	      Course = newCourse;
	   }
	   public void setYear(int newYear) {
		      Year = newYear;
		   }
	   
}

