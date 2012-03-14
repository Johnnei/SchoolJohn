package lift;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class LiftPanel extends JPanel {
	
	private Lift lift;
	
	public LiftPanel(Lift lift) {
		this.lift = lift;
		setPreferredSize(new Dimension(200, 400));
	}
	
	public void paintComponent(Graphics g) {
		g.drawLine(10, 10, 10, 300);
		g.drawLine(10, 300, 100, 300);
		g.setColor(Color.BLUE);
		g.fillRect(10, (50 * (lift.getAantalVerdiepingen() - lift.getVerdieping())), 70, 50);
	}
	
	public Lift getLift() {
		return lift;
	}

}
