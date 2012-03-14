/*
 * LiftFrame.java
 *
 * Created on 21 oktober 2007, 14:07
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package lift;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Wim JM Schepers
 */
public class LiftFrame extends JFrame implements ActionListener {
  
  private JButton btnUp, btnDown, btnOK;
  private JTextField jtfVerdieping, jtfGaNaarVerdieping;
  private JLabel lblGaNaar;
  private LiftPanel liftPanel;
         
  /** Creates a new instance of LiftFrame */
  public LiftFrame() {
    setDefaultCloseOperation( EXIT_ON_CLOSE );
    setLayout( new FlowLayout() );

    btnUp = new JButton( "up" );
    btnDown = new JButton( "down" );
    jtfVerdieping = new JTextField( 5 );
    jtfVerdieping.setText("0");
    lblGaNaar = new JLabel( "Ga naar: " );
    jtfGaNaarVerdieping = new JTextField( 5 );
    btnOK = new JButton( "ok" );
    liftPanel = new LiftPanel(new Lift(5));
        
    add( btnUp );
    add( btnDown );
    add( jtfVerdieping );
    add( lblGaNaar );
    add( jtfGaNaarVerdieping );
    add( btnOK );
    add(liftPanel);
    
    btnUp.addActionListener( this );
    btnDown.addActionListener( this );
    btnOK.addActionListener( this );
    
    jtfVerdieping.setEditable( false );
    jtfVerdieping.setText( "" /* + lift.getHuidigeVerdieping() */);
    
    setTitle( "Lift" );
    setVisible( true );
  }
  
  public void actionPerformed( ActionEvent e ) {
	  try {
		if ( e.getSource() == btnUp ) {
			liftPanel.getLift().up();
	    	jtfGaNaarVerdieping.setText("" + liftPanel.getLift().getVerdieping());
	    	repaint();
	    }
	    else if ( e.getSource() == btnDown ) {
	    	liftPanel.getLift().down();
	    	jtfGaNaarVerdieping.setText("" + liftPanel.getLift().getVerdieping());
	    	repaint();
	    }
	    else if ( e.getSource() == btnOK ) {
	    	liftPanel.getLift().naarEtage(jtfGaNaarVerdieping.getText(), this);
	    	repaint();
	    }
	  } catch (OngeldigeVerdiepingException ex) {
		new ErrDialog(this, "Error!", "Ongeldige Verdieping!");
	  }
  }
  
}
