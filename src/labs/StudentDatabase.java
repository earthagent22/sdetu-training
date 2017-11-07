package labs;

public class StudentDatabase {
	public static void main(String[] args) {
		Student stu1 = new Student("Josh", "128982401");
		stu1.enroll("Library Science");
		stu1.enroll("Wumbo");
		//not able to make an array work that adds classes at will
		stu1.setCity("Jupiter");
		stu1.setPhone("561-867-5309");
		stu1.setState("Florida");
		System.out.println(stu1.toString());
		stu1.pay(500.50);
		stu1.checkBalance();
		stu1.showCourses();
	
		
		
	}
	
}
class Student {
	private String SSN;
	private String name;
	private static int iD = 1001;
	private String email;
	private String userID;
	private String classList = "";
	private double balance;
	private String phone;
	private String city;
	private String state;
	private double costOfCourse = 500;
	
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Student(String name, String SSN) {
		this.name = name;
		this.SSN = SSN; 
		setUserID(SSN);
		setEmail();
		iD++;
	}
	private void setUserID(String SSN) {
		int random;
		do  {random = (int) (Math.random() * 10000);
		}while((random<1000) || (random > 9000));
		userID = iD + "" + random + SSN.substring(5);
		System.out.println(userID);
	}
	public void setEmail(){
		email = name + (iD-1000) + "" + "@reallygoodschool.edu";
		System.out.println(email);
	}
	/*
	public void enroll(String newClass) {
		int addNumber = classList.length;
		classList[addNumber] = newClass;
	}
	public String[] showCourses() {
		return classList;
	}
	
	public void enroll(String newClasses) {
		classList = newClasses;
		balance = balance - 500;
	}
	*/
	public void enroll(String newClass) {
		classList = classList + newClass + "\n";
		balance = balance - costOfCourse;
	}
	public String showCourses() {
		System.out.println(classList);
		return classList;
	}
	public void pay(double amount) {
		balance = balance + amount;
	}
	public double checkBalance() {
		System.out.println("Your current balance is: " + balance);
		return balance;
	}
	public String toString() {
		String allTheStuff = "[Name: " + name + "]\n[User ID: " + userID + "]\n[Balance: " + balance + "]\n[Courses: " + classList + "]\n[Email: " + email + "]";
		return allTheStuff;
	}
	
}
