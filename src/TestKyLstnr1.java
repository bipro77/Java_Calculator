import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
public class TestKyLstnr1 extends JPanel implements ActionListener
{	
	Timer tm=new Timer(8, this);
	int x=0,spdx=2, y=4,spdy=2;

	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillRect(x, 100, 50, 50);
		g.setColor(Color.BLUE);
		g.fillRect(y, y, 50, 50);
		tm.start();
	}
	
	public void actionPerformed(ActionEvent e){
	if(x<0||x>450)
	spdx=-spdx;
	if(y<0||y>450)
	spdy=-spdy;
	
	x=x+spdx;
    y=y+spdy;
	repaint();
}
public static void main(String[] args)
{
		TestKyLstnr1 t=new TestKyLstnr1();
		JFrame jf=new JFrame("Tarun");
		jf.add(t);
		jf.setSize(500, 500);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
