
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdelfatah Ibrahim
 */
public class panel extends JPanel {
    
    private JTextArea textarea;
    
    public panel(){
        textarea = new JTextArea(20,20);
        
        setLayout(new FlowLayout());
        add(new JScrollPane(textarea));
        
    }
    
    public void apendText(String text){
        textarea.append(text);
    }
    
}
