import java.awt.*;

import java.applet.*;

public class appletprgm1 extends Applet

{

public void paint(Graphics g){

g.setColor(Color.blue);

g.fillOval(100, 0, 100, 100);

g.setColor(Color.blue);

g.fillRect(100, 300, 300, 100);

int xPoints[] = {250,320,170,250};

int yPoints[] = {100,175,150,175};

g.setColor(Color.blue);

g.fillPolygon(xPoints, yPoints, 3);

}}