package opgave4a;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Scherm extends JFrame implements ActionListener {

	ArrayList<Persoon> lijst;
	JTextField invoer_naam = new JTextField();
	JTextField invoer_achter = new JTextField();
	JTextArea output = new JTextArea();
	JLabel[] label = new JLabel[2];
	JButton voegtoe = new JButton("Voegtoe");
	
	public Scherm() {
		lijst = new ArrayList<Persoon>();
		voegtoe.addActionListener(this);
		label[0] = new JLabel("Voornaam: ");
		label[1] = new JLabel("Achternaam: ");
		setLayout(new GridLayout(0, 2));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(label[0]);
		add(invoer_naam);
		add(label[1]);
		add(invoer_achter);
		add(voegtoe);
		add(new JPanel()); //Spacer
		add(output);
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Scherm();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton) {
			lijst.add(new Persoon(invoer_naam.getText(), invoer_achter.getText()));
			invoer_naam.setText("");
			invoer_achter.setText("");
			output.setText(output.getText() + lijst.get(lijst.size() - 1).geefVolledigeNaam() + "\r\n");
		}
	}
}
