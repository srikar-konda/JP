import java.awt.Frame;
import java.awt.Color;
import java.awt.event.*;
import java.awt.*;
class MyFrame extends Frame 
{
	MyFrame()
	{
	   this.setVisible(true);
		this.setSize(500,500);
        this.setTitle("Login page");
		this.setBackground(Color.GREEN);
		this.addWindowListener(new WindowListenerDemo());
	}
}
 
 class WindowListenerDemo extends WindowAdapter
 {

public void windowClosing(WindowEvent we)
	{
	System.out.println("Window is closing");
	System.exit(0);

    }

 } 
    class WindowsListenerex2
	{
    
public static void main(String[] args) 
	{
		
		MyFrame d=new MyFrame();

		
	}
}
