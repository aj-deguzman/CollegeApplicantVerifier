package ApplicantVerifier;

import ApplicantVerifier.CandidateApplication;
import ApplicantVerifier.RejectApplicant;
import ApplicantVerifier.AcceptApplicant;
import javax.swing.JOptionPane;

public class VerifyApplicant implements IVerifyApplicant {
	CandidateApplication ca = new CandidateApplication();
	RejectApplicant ra = new RejectApplicant();
	AcceptApplicant aa = new AcceptApplicant();

	public void verifyApplicant() {
		ca.createApplication();
		String rejResults = ra.verifyRejection(ca.getFelonies(), ca.getGpa(), ca.getGpaScale(), ca.getAge(),
				ca.getFirstName(), ca.getLastName());
		String accResults = aa.verifyAcceptance(ca.getAge(), ca.getState(), ca.getGpa(), ca.getGpaScale(), ca.getSat(), ca.getAct());

		if (rejResults != null) {
			JOptionPane.showMessageDialog(null, rejResults, "Status", JOptionPane.INFORMATION_MESSAGE);
		} else if (accResults != null) {
			JOptionPane.showMessageDialog(null, accResults, "Status", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Further Review", "Status", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
