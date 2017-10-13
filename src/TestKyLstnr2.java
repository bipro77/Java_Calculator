import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
public class TestKyLstnr2 extends JPanel implements ActionListener,KeyListener
{	
	Timer tm=new Timer(5, this);
	int x=0,y=0,spdx=0,spdy=0;
	public TestKyLstnr2() {
		tm.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
	}
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillRect(x, y, 50, 30);
	}
	public void actionPerformed(ActionEvent e){
	x=x+spdx;
	y=y+spdy;
	repaint();
	}
	public void keyPressed(KeyEvent e1){
	int xyz=e1.getKeyCode();	
	if(xyz==KeyEvent.VK_LEFT){
		spdx=-1; 
		spdy=0;
	}
	if(xyz==KeyEvent.VK_UP){
		spdx=0; 
		spdy=-1;
	}
	if(xyz==KeyEvent.VK_RIGHT){
		spdx=1; 
		spdy=0;
	}
	if(xyz==KeyEvent.VK_DOWN){
		spdx=0; 
		spdy=1;
	}}
	public static void main(String[] args)
	{
		TestKyLstnr2 t=new TestKyLstnr2();
		JFrame jf=new JFrame("Tarun");
		jf.add(t);
		jf.setSize(500, 500);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void keyReleased(KeyEvent e) {
		spdx=0; spdy=0;
	}
	public void keyTyped(KeyEvent e) {
		
	}
}
