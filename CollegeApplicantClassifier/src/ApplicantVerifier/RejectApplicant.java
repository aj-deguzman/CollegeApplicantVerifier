package ApplicantVerifier;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RejectApplicant extends Applicant {
	private ArrayList<String> reason = new ArrayList<String>();

	public String verifyRejection(int felonies, double gpa, double scale, int age, String firstName, String lastName) {
		this.verifyFelonies(felonies);
		this.verifyAge(age);
		this.verifyGPA(gpa, scale);
		this.verifyName(firstName, lastName);

		if (!this.reason.isEmpty()) {
			return "Instant Reject due to:" + System.getProperty("line.separator") + this.compileReason();
		} else {
			return null;
		}
	}

	public void verifyFelonies(int felonies) {
		if (felonies >= 1) {
			this.reason.add("Has " + felonies + " felonies");
		}
	}

	public void verifyAge(int age) {
		if (age < 0) {
			this.reason.add("Age was inputted as a negative number");
		}
	}

	public void verifyGPA(double gpa, double scale) {
		DecimalFormat df = new DecimalFormat("#");
		double decimalPerc = gpa / scale;
		double perc = decimalPerc * 100;

		if (perc < 70) {
			this.reason.add("GPA is " + df.format(perc) + "% of provided scale");
		}
	}

	public void verifyName(String firstName, String lastName) {
		Pattern p = Pattern.compile("^[A-Z]+$");
		Matcher first = p.matcher(firstName.substring(1));
		Matcher last = p.matcher(lastName.substring(1));

		if (Character.isLowerCase(firstName.charAt(0)) || Character.isLowerCase(lastName.charAt(0))) {
			this.reason.add("First and/or last name initials are not uppercase");
		}

		if (first.matches() || last.matches()) {
			this.reason.add("The rest of the first and/or last name letters are not lowercase");
		}
	}

	public String compileReason() {
		StringBuilder sb = new StringBuilder();

		for (String s : this.reason) {
			sb.append(s);
			sb.append(System.getProperty("line.separator"));
		}

		return sb.toString();
	}
}
