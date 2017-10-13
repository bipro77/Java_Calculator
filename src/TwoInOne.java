import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class TwoInOne {
	JFrame jf;
	JButton jb1, jb2;
	JTextArea jt1;

	public TwoInOne() {

		jf = new JFrame();
		jf.setSize(500, 500);

		jb1 = new JButton("Click");
		jb1.setBounds(80, 200, 80, 50);
		jf.add(jb1);

		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jb1) {
					JOptionPane.showMessageDialog(jb1, "hello");
				}

			}
		});

		/*
		 * jb2=new JButton("Enter"); jb2.addActionListener(this);
		 * jb2.setBounds(180, 350, 80, 50);
		 */

		jt1 = new JTextArea();
		jt1.setBounds(80, 80, 120, 80);

		jf.add(jt1);
		jf.add(jb2);
		jf.setLayout(null);
		jf.setVisible(true);

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new TwoInOne();
	}

	/*
	 * if(e.getActionCommand()=="Enter"){ jt1.setText("hi"); }
	 */
	/*
	 * if(e.getSource()==jb1){ jt1.setText("hello again !!"); }
	 */

}
