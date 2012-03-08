package deelA;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Overzicht extends JDialog {
	
	public Overzicht(JFrame owner, Winkel w) {
		super(owner, true);
		setPreferredSize(new Dimension(500, 310));
		JTextArea text = new JTextArea(w.getAll());
		text.setPreferredSize(new Dimension(450, 300));
		setLayout(new FlowLayout());
		add(text);
		pack();
	}
	
}
