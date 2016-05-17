package da.agar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameBoard extends JPanel{
	
	
	
	
	
	public static Color[] colors = {Color.RED, Color.BLUE, Color.CYAN, Color.GREEN, Color.YELLOW, Color.MAGENTA, Color.PINK, Color.ORANGE, Color.BLACK};
	
	Drawable[] objects = new Drawable[1000];

	
	
	
	
	
	
	/**
	 * Method inherited from JPanel.  JPanel calls this method when the setVisible method is called.
	 */
	@Override
	public void paint(Graphics g){
		
		for(int i = 0; i < objects.length; i++){
			objects[i].paint(g);	// Pass g2d to this method instead of g.
		}
		
		
		boolean isVisible = false;
		if(isVisible == true){
			setVisible(true);
		}
		else{
			setVisible(false);
		}
		
		int size = 50;
		int xPosition = 0;
		int yPosition = 0;
		Graphics2D g2d = (Graphics2D) g;	// Put this line first in the method
		int x = (int)(Math.random() * 8);
		g2d.setColor(colors[x]);
		g2d.fillOval(xPosition,yPosition,size,size);
		g2d.translate(100,140);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[]){
	
		JFrame f = new JFrame();
		GameBoard x = new GameBoard();
		f.setLayout(new BorderLayout());
		f.add(x, BorderLayout.CENTER);
		f.setBackground(Color.WHITE);
		
		f.setSize(300,300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}






