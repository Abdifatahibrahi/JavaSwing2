/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;





class nclass extends JFrame implements ActionListener{
    
    JTextField tf;
    JRadioButton r1,r2;
    JButton b;
    JLabel l;
    JCheckBox c1,c2;
    public nclass(){
        
        tf = new JTextField(30);
        r1 = new JRadioButton("male");
        r2 = new JRadioButton("female");
        b = new JButton("ok");
        l = new JLabel("Greeting");
        c1 = new JCheckBox("Singer");
        c2 = new JCheckBox("Swimmer");
        
        
        add(tf);
        add(r1);
        add(r2);
        add(b);
        add(l);
        add(c1);
        add(c2);
        
        ButtonGroup jb = new ButtonGroup();
        jb.add(r1);
        jb.add(r2);
        
        
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                String name = tf.getText();
                if(r1.isSelected()){
                    name = "Mr. "+ name;
                }
                
                if(r2.isSelected()){
                    name = "Ms. "+ name;
                }
                
                if(c1.isSelected()){
                    name = name +"Dancer";
                }
                
                if(c2.isSelected()){
                    name = name +"Swimmer";
                }
                
                l.setText(name);
            }
        });
                {
                    
                }
        
        setLayout(new FlowLayout());        
        setVisible(true);        
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
}
