import java.awt.*;
//import java.awt.;
class FrameDemo extends Frame 
{
	FrameDemo()
	{
	   this.setVisible(true);
		this.setSize(500,1000);
        this.setTitle("Welcome to BVRITH");
		this.setBackground(Color.RED);
		this.setForeground(Color.GREEN);
	}
	public void paint(Graphics g)
	{
	Font font=new Font("arial", Font.ITALIC+Font.BOLD,35);
	g.setFont(font);
	g.drawString("Welcome to BVRITH", 100,100);
	}

}
    class Test2
	{
    
public static void main(String[] args) 
	{
		
		FrameDemo d=new FrameDemo();

		
	}
}
