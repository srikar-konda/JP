//import java.awt.Frame;
//import java.awt.Color;
//import java.awt.Event.*;
import java.awt.*;
import java.awt.event.*;
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
 
 class WindowListenerDemo implements WindowListener
 {
public void windowOpened(WindowEvent we)
	{
     System.out.println("window opened");
     }
public void windowClosed(WindowEvent we)
	{
     System.out.println("window closed");
     }
public void windowIconified(WindowEvent we)
	{
     System.out.println("window iconified");
     }
public void windowDeiconified(WindowEvent we)
	{
     System.out.println("window deiconified");
     }
public void windowClosing(WindowEvent we)
	{
	System.out.println("window closing");
	System.exit(0);

    }
public void windowActivated(WindowEvent we)
	{
     System.out.println("window activated");
     }
public void windowDeactivated(WindowEvent we)
	{
     System.out.println("window deactivated");
     }

 } 
    class WindowsListenerex1
	{
    
public static void main(String[] args) 
	{
		
		MyFrame d=new MyFrame();

		
	}
}
