package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
	private int uid;
	private String firstName;
	private String lastName;
	private int gradeYear;
	private List<Course> coursesJoined = new ArrayList<Course>();
	private double tutionBalance = 0d;
	private double lastTutionPayment;
	private static int id = 1000;
	private static int courseId = 0;

	public Student() {
		super();
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the first name");
		setFirstName(s.nextLine());
		System.out.println("Please enter the first name");
		setLastName(s.nextLine());
		System.out.println("Please enter the grade Year");
		setGradeYear(Integer.parseInt(s.nextLine()));

		
		do {
			System.out.println("please enroll for course and type Q for Quiet ");
			String couresName = s.nextLine();
			if (!(couresName.equals("Q"))) {
				assignCourseToStudent(couresName);
			} else
				break;

		} while (1 == 1);
		generateUid();

		tutionPayment();
		showInfo();

		// TODO Auto-generated constructor stub
	}

	private void generateUid() {
		this.id++;
		setUid(this.id);
	}

	private void assignCourseToStudent(String courseName) {
		this.courseId++;
		Course courseObj = new Course();
		courseObj.setId(this.courseId);
		courseObj.setName(courseName);
		// fees of each course is same
		courseObj.setFee(500);
        setTutionBalance(this.getTutionBalance() + courseObj.getFee());
       	coursesJoined.add(courseObj);
		System.out.println("Now your balance is Rs :" + this.getTutionBalance());

	}

	public void tutionPayment() {

		System.out.println("How much fee would you like to pay.");
		Scanner sc = new Scanner(System.in);
		double pay = sc.nextDouble();
		setTutionBalance(getTutionBalance() - pay);
		setLastTutionPayment(pay);
		System.out.println("Thank you for payment of Rs : " + this.getLastTutionPayment());
		System.out.println("Now your balance is R : " + this.getTutionBalance());

	}

	public void showInfo() {

		System.out.println("Name:-" + getFirstName() + " " + getLastName());
		System.out.println("There are following courses, you have chosen.");
		for (Course c : coursesJoined) {
			System.out.println(c.getName() + "at Rs : " + c.getFee());
		}

		System.out.println("Tustion Balance : " + this.getTutionBalance());
		System.out.println("Last payment has been done by you of Rs : " + this.getLastTutionPayment());
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
