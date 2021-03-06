package deelA;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TrackDialog extends JDialog implements ActionListener {
	
	private JButton butTrack = new JButton("Add Track");
	private JTextField trackTitel = new JTextField();
	private JTextField trackDuur = new JTextField();
	private boolean addTrack = false;
	
	public TrackDialog(Frame owner) {
		super(owner, true);
		trackTitel.setPreferredSize(new Dimension(300, 25));
		trackDuur.setPreferredSize(new Dimension(100, 25));
		butTrack.addActionListener(this);
		setLayout(new FlowLayout());
		add(new JLabel("Track Titel: "));
		add(trackTitel);
		add(new JLabel("Track Duur: "));
		add(trackDuur);
		add(butTrack);
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(butTrack)) {
			addTrack = true;
			setVisible(false);
		}
	}
	
	public String getTitel() {
		return trackTitel.getText();
	}
	
	public String getDuur() {
		return trackDuur.getText();
	}
	
	public boolean normalClose() {
		return addTrack;
	}

}
