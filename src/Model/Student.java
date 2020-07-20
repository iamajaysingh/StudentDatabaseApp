package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
	private int uid;
	private String firstName;
	private String lastName;
	private int gradeYear;
	private List<Course> coursesJoined;
	private double tutionBalance=0d;
	private double lastTutionPayment;
	private static int id=1000;

	public Student() {
		super();
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the first name");
		setFirstName(s.nextLine());
		System.out.println("Please enter the first name");
		setLastName(s.nextLine());
		System.out.println("Please enter the grade Year");
		setGradeYear(Integer.parseInt(s.nextLine()));
		System.out.println(
				"please chose course\n 1) History\n 2) Mathematics\n3) English\n4) Chemistry\n5) Computer sciense and please type couser id with followed by #");
		String courese = s.nextLine();
		generateUid();
		assignCourseToStudent(courese);
		tutionPayment();

		// TODO Auto-generated constructor stub
	}
	
	private void generateUid() {
		this.id++;
		setUid(this.id); 
	}

	private void assignCourseToStudent(String course) {

		coursesJoined = new ArrayList<Course>();

		String[] courseArr = course.split("#");

		for (int i = 0; i < courseArr.length; i++) {

			// Course c = new Course();

			int couseId = Integer.parseInt(courseArr[i]);
			Course courseObj = new Course();
			switch (couseId) {

			case 1:
				// Course courseObj = new Course();
				courseObj.setId(1);
				courseObj.setName("History");
				courseObj.setFee(500);
				break;
			case 2:
				// Course courseObj2 = new Course();
				courseObj.setId(2);
				courseObj.setName("Mathematics");
				courseObj.setFee(600);
				break;
			case 3:
				// Course courseObj3 = new Course();
				courseObj.setId(3);
				courseObj.setName("English");
				courseObj.setFee(800);
				break;
			case 4:
				// Course courseObj4 = new Course();
				courseObj.setId(4);
				courseObj.setName("Chemistry");
				courseObj.setFee(800);

				break;
			case 5:
				// Course courseObj5 = new Course();ajay
				courseObj.setId(5);
				courseObj.setName("Computer sciense");
				courseObj.setFee(900);
				break;
			default:
				System.out.println("You have not enrolled any course");

			}
			
			//=this.getTutionBalance()+courseObj.getFee();
			
			setTutionBalance(this.getTutionBalance()+courseObj.getFee());

			coursesJoined.add(courseObj);

		}

	}

	public void tutionPayment() {
		
		System.out.println("how much fee would you like to do.");
		Scanner sc = new Scanner(System.in);
		 double  pay=sc.nextDouble();
		 setTutionBalance(getTutionBalance()-pay);
		 setLastTutionPayment(pay);
		 System.out.println("Thank you for you payment of Rs : " +this.getLastTutionPayment());
		 System.out.println("Now your balance is R :"+ this.getTutionBalance());
		
	}
	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getGradeYear() {
		return gradeYear;
	}

	public void setGradeYear(int gradeYear) {
		this.gradeYear = gradeYear;
	}

	public double getTutionBalance() {
		return tutionBalance;
	}

	public void setTutionBalance(double tutionBalance) {
		this.tutionBalance = tutionBalance;
	}

	public List<Course> getCoursesJoined() {
		return coursesJoined;
	}

	public void setCoursesJoined(List<Course> coursesJoined) {
		this.coursesJoined = coursesJoined;
	}

	public double getLastTutionPayment() {
		return lastTutionPayment;
	}

	public void setLastTutionPayment(double lastTutionPayment) {
		this.lastTutionPayment = lastTutionPayment;
	}

	@Override
	public String toString() {
		return "Student [uid=" + uid + ", firstName=" + firstName + ", lastName=" + lastName + ", gradeYear="
				+ gradeYear + ", coursesJoined=" + coursesJoined + ", tutionBalance=" + tutionBalance + "]";
	}

}
