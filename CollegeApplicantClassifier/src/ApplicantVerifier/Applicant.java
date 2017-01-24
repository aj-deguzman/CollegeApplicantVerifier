package ApplicantVerifier;

import java.text.DecimalFormat;

public abstract class Applicant {
	public void verifyAge(int age) {
	};

	public void verifyGPA(double gpa, double scale) {
		DecimalFormat df = new DecimalFormat("#");
		double decimalPerc = gpa / scale;
		double perc = decimalPerc * 100;
	}
}
