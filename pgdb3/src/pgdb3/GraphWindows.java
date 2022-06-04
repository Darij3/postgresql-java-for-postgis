package pgdb3;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.util.List;
import javax.swing.JPanel;

import net.postgis.jdbc.PGgeometry;
import net.postgis.jdbc.geometry.*;
import java.awt.geom.AffineTransform;

public class GraphWindows extends JPanel {
public GraphWindows(dbc dbcon) {
this.dbcon = dbcon;
}
public void paintComponent(Graphics g) {
Graphics2D g2 = (Graphics2D) g;
AffineTransform tform = AffineTransform.getTranslateInstance( 0, 500);
tform.scale(3, -3);
List<PGgeometry> lst = dbcon.getJList();
for(int i=0; i<=lst.size()-1; i++){
if(lst.get(i) != null){
Shape a = Shape(tform);
g2.draw(a);
}
}
}
private Shape Shape(AffineTransform tform) {
	// TODO Auto-generated method stub
	return null;
}
private dbc dbcon;
private static final long serialVersionUID = 1L;
}