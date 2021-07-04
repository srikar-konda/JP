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
		this.addMouseListener(new MouseListenerDemo());
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
 
 class MouseListenerDemo implements MouseListener
 {

	public void mouseClicked(MouseEvent me)
	{
     System.out.println("Mouse clicked ["+me.getX() +"," +me.getY()+"]");
     }
public void mousePressed(MouseEvent me){
     System.out.println("Mouse pressed ["+me.getX() +"," +me.getY()+"]");
     }
public void mouseReleased(MouseEvent me){
   System.out.println("Mouse Released ["+me.getX() +"," +me.getY()+"]");
     }
public void mouseEntered(MouseEvent me){
    System.out.println("Mouse Entered ["+me.getX() +"," +me.getY()+"]");
     }
public void mouseExited(MouseEvent me){
    System.out.println("Mouse Exited["+me.getX() +"," +me.getY()+"]");
     } 


 } 
    class MouseListenerex1
	{
    
public static void main(String[] args) 
	{
		
		MyFrame d=new MyFrame();

		
	}
}
