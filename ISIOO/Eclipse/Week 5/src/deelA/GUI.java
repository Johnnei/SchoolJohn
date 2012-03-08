package deelA;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener {
	
	private Winkel wkl = new Winkel();
	private JTextField artiest = new JTextField();
	private JTextField titel = new JTextField();
	private JTextField voorraad = new JTextField();
	private JTextField trackTitel = new JTextField();
	private JTextField trackDuur = new JTextField();
	private JButton butCD = new JButton("Add CD");
	private JButton butTrack = new JButton("Add Track");
	private JButton clear = new JButton("Clear");
	private JMenuBar menuBar = new JMenuBar();
	private JMenu option = new JMenu("Opties");
	private JMenuItem overzicht = new JMenuItem("Overzicht");
	
	public GUI() {
		//FlowLayout Sizing
		artiest.setPreferredSize(new Dimension(300, 25));
		titel.setPreferredSize(new Dimension(300, 25));
		voorraad.setPreferredSize(new Dimension(100, 25));
		trackTitel.setPreferredSize(new Dimension(300, 25));
		trackDuur.setPreferredSize(new Dimension(100, 25));
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Action Handler
		butCD.addActionListener(this);
		butTrack.addActionListener(this);
		clear.addActionListener(this);
		overzicht.addActionListener(this);
		
		setPreferredSize(new Dimension(400, 300));
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(new JLabel("Artiest: "));
		add(artiest);
		add(new JLabel("Titel: "));
		add(titel);
		add(new JLabel("Voorraad: "));
		add(voorraad);
		add(butCD);
		add(clear);
		add(new JLabel("Track Titel: "));
		add(trackTitel);
		add(new JLabel("Track Duur: "));
		add(trackDuur);
		add(butTrack);
		
		//Menu
		menuBar.add(option);
		option.add(overzicht);
		setJMenuBar(menuBar);
		
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(butCD)) {
			wkl.addCd(artiest.getText(), titel.getText(), Integer.parseInt(voorraad.getText().replace(',', '.')));
		} else if (e.getSource().equals(clear)) {
			artiest.setText("");
			titel.setText("");
			voorraad.setText("");
		} else if (e.getSource().equals(butTrack)) {
			wkl.addTrack(artiest.getText(), titel.getText(),trackTitel.getText(), trackDuur.getText());
		} else if (e.getSource().equals(overzicht)) {
			Overzicht o = new Overzicht(this, wkl);
			o.setVisible(true);
		}
	}

}
