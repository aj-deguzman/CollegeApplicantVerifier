package ApplicantVerifier;

import java.util.ArrayList;

public class AcceptApplicant extends Applicant {
	private ArrayList<String> flag = new ArrayList<String>();

	public String verifyAcceptance(int age, String state, double gpa, double scale, int sat, int act) {
		this.verifyAge(age, state);
		this.verifyGPA(gpa, scale);
		this.verifySATOrACT(sat, act);

		if (this.flag.contains("false")) {
			return null;
		} else {
			return "Instant Accept";
		}
	}

	public void verifyAge(int age, String state) {
		if (state.equalsIgnoreCase("CA") || state.equalsIgnoreCase("California")) {
			if (age >= 17 && age <= 26) {
				this.flag.add("true");
			} else {
				this.flag.add("false");
			}
		} else {
			if (age > 80) {
				this.flag.add("true");
			} else {
				this.flag.add("false");
			}
		}
	}

	public void verifyGPA(double gpa, double scale) {
		double decimalPerc = gpa / scale;
		double perc = decimalPerc * 100;

		if (perc >= 90) {
			this.flag.add("true");
		} else {
			this.flag.add("false");
		}
	}

	public void verifySATOrACT(int sat, int act) {
		if (sat > 1920 || act > 27) {
			this.flag.add("true");
		} else {
			this.flag.add("false");
		}
	}
}
