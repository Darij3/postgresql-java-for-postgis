package pgdb3;
import java.awt.*;
import javax.swing.*;


public class vizual extends JPanel 
{
public void paintComponent (Graphics g)
{
	super.paintComponent(g);
	setForeground(Color.BLACK);
	setBackground(Color.WHITE);
	g.drawLine(53,43,53,50);
	g.drawLine(67,13,83,25);
	g.drawLine(110,25,110,50);
	g.drawLine(120,50,120,25);
	g.drawLine(50,55,120,50);
	
	g.drawRect(2,35,17,15);
	g.drawRect(28,50,48,43);
	g.drawRect(58,25,88,58);
	g.drawRect(15,25,120,15);
	g.drawRect(63,58,88,63);
	
	g.drawOval(25,50,2,80);
	g.drawOval(28,15,5,8);
	g.drawOval(35,10,50,80);
	g.drawOval(45,10,5,8);
	g.drawOval(40,25,50,80);
	g.drawOval(38,27,5,8);
	g.drawOval(50,25,80,8);
	g.drawOval(55,15,5,8);
}


	public static void main(String[] args)
	{
		
		vizual d = new vizual();
		JFrame f=new JFrame("Display Graphic Drawing");
		f.add(d);
		f.setSize(400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	
}
}
