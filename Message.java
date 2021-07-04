import java.awt.*;
import java.awt.event.*;

class Message extends Frame {
	Message(){
	addWindowListener(new WindowAdapter()
{
	public void windowClosing(WindowEvent e){
	System.exit(0);
}
});
}
public void paint(Graphics g) {
this.setBackground(new Color(100,20,20));
Font f = new Font ("Arial", Font.BOLD + Font.ITALIC,10);
g.setFont(f);
g.setColor(Color.yellow);
g.drawString("Welcome to BVRIT Hyderabad", 50,100);
}


public static void main(String args[]){
		
	Message m = new Message();
	
	m.setSize(400,250);
	m.setTitle("This is my Text");
	m.setVisible(true);
	
}
}
