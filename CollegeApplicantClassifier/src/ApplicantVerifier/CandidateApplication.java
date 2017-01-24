package ApplicantVerifier;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CandidateApplication extends ApplicantInfo {
	private String firstName;
	private String lastName;
	private String state;
	private String age;
	private String gpa;
	private String gpaScale;
	private String sat;
	private String act;
	private String felonies;

	private void submitApplication() {
		try {
			this.setFirstName(this.firstName);
			this.setLastName(this.lastName);
			this.setState(this.state);
			this.setAge(Integer.parseInt(this.age));
			this.setGpa(Double.parseDouble(this.gpa));
			this.setGpaScale(Double.parseDouble(this.gpaScale));
			this.setSat(Integer.parseInt(this.sat));
			this.setAct(Integer.parseInt(this.act));
			this.setFelonies(Integer.parseInt(this.felonies));

			JOptionPane.showMessageDialog(null, "Application Submitted", "Message", JOptionPane.INFORMATION_MESSAGE);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, e.getMessage() + " must be a number", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	public void createApplication() {
		JTextField firstName = new JTextField("");
		JTextField lastName = new JTextField("");
		JTextField state = new JTextField("");
		JTextField age = new JTextField("");
		JTextField gpa = new JTextField("");
		JTextField gpaScale = new JTextField("");
		JTextField sat = new JTextField("");
		JTextField act = new JTextField("");
		JTextField felonies = new JTextField("");

		JPanel panel = new JPanel(new GridLayout(20, 20));

		panel.add(new JLabel("First Name:"));
		panel.add(firstName);
		panel.add(new JLabel("Last Name Name:"));
		panel.add(lastName);
		panel.add(new JLabel("State:"));
		panel.add(state);
		panel.add(new JLabel("Age:"));
		panel.add(age);
		panel.add(new JLabel("GPA Score:"));
		panel.add(gpa);
		panel.add(new JLabel("GPA Scale:"));
		panel.add(gpaScale);
		panel.add(new JLabel("SAT Score:"));
		panel.add(sat);
		panel.add(new JLabel("ACT Score:"));
		panel.add(act);
		panel.add(new JLabel("Number of Felonies in last 5 years:"));
		panel.add(felonies);

		int confirmation = JOptionPane.showConfirmDialog(null, panel, "College Application",
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

		if (confirmation == JOptionPane.OK_OPTION) {
			this.firstName = firstName.getText();
			this.lastName = lastName.getText();
			this.state = state.getText();
			this.age = age.getText();
			this.gpa = gpa.getText();
			this.gpaScale = gpaScale.getText();
			this.sat = sat.getText();
			this.act = act.getText();
			this.felonies = felonies.getText();

			this.submitApplication();
		} else {
			JOptionPane.showMessageDialog(null, "Application Cancelled", "Message", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
