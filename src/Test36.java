
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 13101193
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Test36 {

    /**
     * @param args the command line arguments
     */
        JFrame jf;
    JButton jb1;
    JButton jb2;
    JTextArea jt1;
    public Test36(){
   jf = new JFrame();
      jf.setSize(500,500);
      jf.setVisible(true);
      jf.setLayout((LayoutManager) new BorderLayout());
      
      jb1 = new  JButton("B1");
      jf.add(jb1, BorderLayout.NORTH);
      jb1.setBounds(20,40,80,50);
      
      
      jf.add(jb1);
       jf.add(jb2);
       
       
      
       
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
          }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new Test36();
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand()=="hello"){
            jt1.setText("Hello");
        }
        
        if(e.getActionCommand()=="hi"){
            jt1.setText("HI");
        }
        
         if(e.getActionCommand()=="hi"){
            JOptionPane.showConfirmDialog(jb1, "Hello from Dialog");
        }
    }
    
}


    