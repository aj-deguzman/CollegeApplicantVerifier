package ApplicantVerifier;

public class ApplicantInfo {
	private String firstName;
	private String lastName;
	private String state;
	private int age;
	private double gpa;
	private double gpaScale;
	private int sat;
	private int act;
	private int felonies;

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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public double getGpaScale() {
		return gpaScale;
	}

	public void setGpaScale(double gpaScale) {
		this.gpaScale = gpaScale;
	}

	public int getSat() {
		return sat;
	}

	public void setSat(int sat) {
		this.sat = sat;
	}

	public int getAct() {
		return act;
	}

	public void setAct(int act) {
		this.act = act;
	}

	public int getFelonies() {
		return felonies;
	}

	public void setFelonies(int felonies) {
		this.felonies = felonies;
	}
}
