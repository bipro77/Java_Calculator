import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.StringTokenizer;

import javax.swing.*;

public class Calculator extends JPanel implements ActionListener, KeyListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9, jb0, 
	jbAdd, jbSub, jbMul, jbDiv, jbDel, jbDot, jbEqual, jbClr;
	static JTextArea jt1;
	static String nums="", num1,num2;
	static String keyString;
	
	public void init() {
//        this.setPreferredSize(new Dimension(500, 500));
        this.addKeyListener(this);
    }
//	Timer tm=new Timer(5, this);
	public Calculator() {
//		tm.start();
//		addKeyListener(this);
//		setFocusable(true);
//		setFocusTraversalKeysEnabled(false);
	}

	public static void main(String[] args) {
		Font font = new Font("Arial", Font.PLAIN, 30);
		JFrame jf = new JFrame("CALCULATOR");
		jf.getContentPane().setLayout(new GridLayout(2, 1));
		JPanel p1 = new JPanel();
		p1.setBackground(Color.lightGray);
		p1.setBounds(50, 50, 20, 68);
		jf.getContentPane().add(p1);

		jt1 = new JTextArea(3, 10);
		jt1.setBounds(00, 00, 220, 568);
		jt1.setFont(font);
		jt1.setEditable(false);
		jt1.setLineWrap(true);
///////////////////////KeyKistener for Numbers
		jt1. addKeyListener(new KeyListener() {			
			@Override
			public void keyTyped(KeyEvent e) {
			
			}			
			@Override
			public void keyReleased(KeyEvent e) {
				
			}			
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				keyString = "key code = " + keyCode + " (" + KeyEvent.getKeyText(keyCode) + ")";
	            System.out.println(keyString);
//	            System.out.println(keyCode);
//	            System.out.println(KeyEvent.KEY_TYPED);
	            if (keyCode == KeyEvent.VK_NUMPAD0 || keyCode == KeyEvent.VK_0) {
					nums = nums+"0";
	            	jt1.setText(nums);
				}
	            else if (keyCode == KeyEvent.VK_NUMPAD1 || keyCode == KeyEvent.VK_1) {
	            	nums = nums+"1";
	            	jt1.setText(nums);
				}
	            else if (keyCode == KeyEvent.VK_NUMPAD2 || keyCode == KeyEvent.VK_2) {
	            	nums = nums+"2";
	            	jt1.setText(nums);
				}
	            else if (keyCode == KeyEvent.VK_NUMPAD3 || keyCode == KeyEvent.VK_3) {
	            	nums = nums+"3";
	            	jt1.setText(nums);
				}
	            else if (keyCode == KeyEvent.VK_NUMPAD4 || keyCode == KeyEvent.VK_4) {
	            	nums = nums+"4";
	            	jt1.setText(nums);
				}
	            else if (keyCode == KeyEvent.VK_NUMPAD5 || keyCode == KeyEvent.VK_5) {
	            	nums = nums+"5";
	            	jt1.setText(nums);
				}
	            else if (keyCode == KeyEvent.VK_NUMPAD6 || keyCode == KeyEvent.VK_6) {
	            	nums = nums+"6";
	            	jt1.setText(nums);
				}
	            else if (keyCode == KeyEvent.VK_NUMPAD7 || keyCode == KeyEvent.VK_7) {
	            	nums = nums+"7";
	            	jt1.setText(nums);
				}
	            else if (keyCode == KeyEvent.VK_NUMPAD8 || keyCode == KeyEvent.VK_8) {
	            	nums = nums+"8";
	            	jt1.setText(nums);
				}
	            else if (keyCode == KeyEvent.VK_NUMPAD9 || keyCode == KeyEvent.VK_9) {
	            	nums = nums+"9";
	            	jt1.setText(nums);
				}
	            else if (keyCode == KeyEvent.VK_ADD || keyCode == KeyEvent.VK_PLUS) {
	            	nums = nums+"+";
	            	jt1.setText(nums);
				}
	            else if (keyCode == KeyEvent.VK_SUBTRACT || keyCode == KeyEvent.VK_MINUS) {
	            	nums = nums+"-";
	            	jt1.setText(nums);
				}
	            else if (keyCode == KeyEvent.VK_MULTIPLY) {
	            	nums = nums+"*";
	            	jt1.setText(nums);
				}
	            else if (keyCode == KeyEvent.VK_DIVIDE) {
	            	nums = nums+"/";
	            	jt1.setText(nums);
				}
	            else if (keyCode == KeyEvent.VK_DECIMAL) {
	            	nums = nums+".";
	            	jt1.setText(nums);
				}
	            else if (keyCode == KeyEvent.VK_BACK_SPACE) {
	            	nums = nums.substring(0,nums.length()-1);
					jt1.setText(nums);
				}
	            else if (keyCode == KeyEvent.VK_EQUALS || keyCode == KeyEvent.VK_ENTER) {
	            	double result=0;
					try{
						jt1.setText(result+"");
					if(nums.contains("+")){
						 StringTokenizer st = new StringTokenizer(nums);
//					     while (st.hasMoreTokens()) {
					        num1 = st.nextToken("+");
					        num2 = st.nextToken("+");	
//					     }						
					 result = Double.parseDouble(num1) + Double.parseDouble(num2);					 
					}
					else if(nums.contains("-")){
						 StringTokenizer st = new StringTokenizer(nums);
//					     while (st.hasMoreTokens()) {
					        num1 = st.nextToken("-");
					        num2 = st.nextToken("-");	
//					     }						
					 result = Double.parseDouble(num1) - Double.parseDouble(num2);					 
					}
					else if(nums.contains("*")){
						 StringTokenizer st = new StringTokenizer(nums);
//					     while (st.hasMoreTokens()) {
					        num1 = st.nextToken("*");
					        num2 = st.nextToken("*");	
//					     }						
					 result = Double.parseDouble(num1) * Double.parseDouble(num2);					 
					}
					else if(nums.contains("/")){
						 StringTokenizer st = new StringTokenizer(nums);
//					     while (st.hasMoreTokens()) {
					        num1 = st.nextToken("/");
					        num2 = st.nextToken("/");	
//					     }						
					 result = Double.parseDouble(num1) / Double.parseDouble(num2);					 
					}
					nums = result+"";
					jt1.setText(result+"");
					} catch (Exception e1) {
						JOptionPane.showInputDialog(e1, "Error: Please Check Your Syntax");
//						JOptionPane.showInternalMessageDialog(e1, "Please Check Your Syntax");
					}
				}// eual end
	            
	            
			}
		});
		p1.add(jt1);

		JPanel temp2 = new JPanel();
		temp2.setLayout(new GridLayout(1, 3));
		jf.getContentPane().add(temp2);

		JPanel p2 = new JPanel();
		p2.setBackground(Color.lightGray);
		temp2.add(p2);

		JPanel p3 = new JPanel();
		p3.setBackground(Color.lightGray);
		temp2.add(p3);

		// JPanel p4 = new JPanel();
		// p4.setBackground(Color.pink);
		// temp2.add(p4);
	///////////////////////JButtons///////////////////////////////////////////////////
		jb1 = new JButton("1");
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jb1) {
					nums = nums + "1";
					jt1.setText(nums);
				}
			}
		});
		// jb1.setFont(font);
		p2.add(jb1);

		jb2 = new JButton("2");
		jb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jb2) {
					nums = nums + 2;
					jt1.setText(nums);
				}
			}
		});
		// jb2.setFont(font);
		p2.add(jb2);
		jb3 = new JButton("3");
		jb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jb3) {
					nums = nums + 3;
					jt1.setText(nums);
				}
			}
		});
		// jb3.setFont(font);
		p2.add(jb3);
		jb4 = new JButton("4");
		jb4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jb4) {
					nums = nums + 4;
					jt1.setText(nums);
				}
			}
		});
		// jb4.setFont(font);
		p2.add(jb4);
		jb5 = new JButton("5");
		// jb5.setFont(font);
		jb5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jb5) {
					nums = nums + 5;
					jt1.setText(nums);
				}
			}
		});
		p2.add(jb5);
		jb6 = new JButton("6");
		jb6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jb6) {
					nums = nums + 6;
					jt1.setText(nums);
				}
			}
		});
		// jb6.setFont(font);
		p2.add(jb6);
		jb7 = new JButton("7");
		jb7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jb7) {
					nums = nums + 7;
					jt1.setText(nums);
				}
			}
		});
		// jb7.setFont(font);
		p2.add(jb7);
		jb8 = new JButton("8");
		jb8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jb8) {
					nums = nums + 8;
					jt1.setText(nums);
				}
			}
		});
		// jb8.setFont(font);
		p2.add(jb8);
		jb9 = new JButton("9");
		jb9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jb9) {
					nums = nums + 9;
					jt1.setText(nums);
				}
			}
		});
		// jb9.setFont(font);
		p2.add(jb9);
		jb0 = new JButton("0");
		jb0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jb0) {
					nums = nums + 0;
					jt1.setText(nums);
				}
			}
		});
		// jb0.setFont(font);
		p2.add(jb0);
		///////////////////// 3////////////////////////////////
		jbAdd = new JButton("+");
		jbAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jbAdd) {
					nums = nums + "+";
					jt1.setText(nums);
				}
			}
		});

		p3.add(jbAdd);

		jbSub = new JButton("-");
		jbSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jbSub) {
					nums = nums + "-";
					jt1.setText(nums);
				}
			}
		});
		// jb0.setFont(font);
		p3.add(jbSub);

		

		jbMul = new JButton("*");
		jbMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jbMul) {
					nums = nums + "*";
					jt1.setText(nums);
				}
			}
		});
		// jb0.setFont(font);
		p3.add(jbMul);

		jbDiv = new JButton("/");
		jbDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jbDiv) {
					nums = nums + "/";
					jt1.setText(nums);
				}
			}
		});
		// jb0.setFont(font);
		p3.add(jbDiv);
		
		jbDot = new JButton(".");
		jbDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jbDot) {
					nums = nums + ".";
					jt1.setText(nums);
				}
			}
		});
		p3.add(jbDot);
		
		jbDel = new JButton("Del");
		jbDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jbDel) {					
					nums = nums.substring(0,nums.length()-1);
					jt1.setText(nums);
				}
			}
		});
		p3.add(jbDel);
		
		jbClr = new JButton("Clr");
		jbClr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jbClr) {
					nums = "";
					jt1.setText(nums);
//					jt1.append(nums);
				}
			}
		});
		p3.add(jbClr);	

		jbEqual = new JButton("=");
		jbEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jbEqual) {
					double result=0;
					try{
					if(nums.contains("+")){
						 StringTokenizer st = new StringTokenizer(nums);
//					     while (st.hasMoreTokens()) {
					        num1 = st.nextToken("+");
					        num2 = st.nextToken("+");	
//					     }						
					 result = Double.parseDouble(num1) + Double.parseDouble(num2);					 
					}
					else if(nums.contains("-")){
						 StringTokenizer st = new StringTokenizer(nums);
//					     while (st.hasMoreTokens()) {
					        num1 = st.nextToken("-");
					        num2 = st.nextToken("-");	
//					     }						
					 result = Double.parseDouble(num1) - Double.parseDouble(num2);					 
					}
					else if(nums.contains("*")){
						 StringTokenizer st = new StringTokenizer(nums);
//					     while (st.hasMoreTokens()) {
					        num1 = st.nextToken("*");
					        num2 = st.nextToken("*");	
//					     }						
					 result = Double.parseDouble(num1) * Double.parseDouble(num2);					 
					}
					else if(nums.contains("/")){
						 StringTokenizer st = new StringTokenizer(nums);
//					     while (st.hasMoreTokens()) {
					        num1 = st.nextToken("/");
					        num2 = st.nextToken("/");	
//					     }						
					 result = Double.parseDouble(num1) / Double.parseDouble(num2);					 
					}
					nums = result+"";
					jt1.setText(result+"");
					} catch (Exception e1) {
						JOptionPane.showInputDialog(e1, "Error: Please Check Your Syntax");
//						JOptionPane.showInternalMessageDialog(e1, "Please Check Your Syntax");
					}
				}
			}
		});
		p3.add(jbEqual);
///////////////////////JButtons Ends///////////////////////////
		jf.setSize(400, 300);
		jf.setLocation(500, 200);
		jf.setVisible(true);
		// jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		if (e.getSource() == jb1) {
			JOptionPane.showConfirmDialog(jb0, "Hello from Dialog");
//		}
//
//		if (e.getActionCommand() == "1") {
//			JOptionPane.showConfirmDialog(jb1, "Hello from Dialog");
//		}
		
//		repaint();

	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
