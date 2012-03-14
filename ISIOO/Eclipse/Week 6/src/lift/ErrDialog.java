package lift;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ErrDialog extends JDialog implements ActionListener {
	
	public ErrDialog(JFrame f, String title, String text) {
		super(f, true);
		setTitle(title);
		setLayout(new FlowLayout());
		JLabel textArea = new JLabel(text);
		JButton but = new JButton("Ok");
		but.addActionListener(this);
		add(textArea);
		add(but);
		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() instanceof JButton) {
			setVisible(false);
		}
	}

}
