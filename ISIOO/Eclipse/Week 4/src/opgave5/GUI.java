package opgave5;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener {
	
	private Winkel wkl = new Winkel();
	private JTextField artiest = new JTextField();
	private JTextField titel = new JTextField();
	private JTextField voorraad = new JTextField();
	
	public GUI() {
		setPreferredSize(new Dimension(800, 600));
		setLayout(new GridLayout(0, 2));
		add(new JLabel("Artiest: "));
		add(artiest);
		add(new JLabel("Titel: "));
		add(titel);
		add(new JLabel("Voorraad: "));
		add(voorraad);
		JButton but = new JButton("Add");
		but.addActionListener(this);
		add(but);
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUI();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() instanceof JButton) {
			wkl.addCd(artiest.getText(), titel.getText(), Integer.parseInt(voorraad.getText().replace(',', '.')));
		}
	}

}