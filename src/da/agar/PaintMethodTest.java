package Agar.lang;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public void paint(Graphics g){
 
for(int i = 0; i < objects.length; i++){
objects[i].paint(g);
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
Graphics2D g2d = (Graphics2D) g;
int x = (int)(Math.random() * 8);
g2d.setColor(colors[x]);
g2d.fillOval(xPosition,yPosition,size,size);
g2d.translate(100,140);
}
