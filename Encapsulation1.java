
public class Encapsulation1 {
	
	public static void main(String args[]) {
	      Encapsulation encap = new Encapsulation();
	      encap.setName("Sreenidhi");
	      encap.setRegistrationno(1234567);
	      encap.setCourse("Computer Science");
	      encap.setYear(2);

	      System.out.print("Name : " + encap.getName() + "; Registration Number : " + encap.getRegistrationno() +"; Course :"+encap.getCourse()+"; Year :" + encap.getYear());
	   }
	}


