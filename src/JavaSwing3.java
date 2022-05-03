
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;







public class JavaSwing3 {
    public static void main(String[] args) {
        swing4 obj = new swing4();

        
        
    }
    
}

class swing4 extends JFrame{
    private JButton btn;
    private panel pnl;
    private Toolbar tbar;
    private formpanel form;
    
    public swing4(){
       tbar = new Toolbar();
       btn = new JButton("click");
       pnl = new panel();
//       tbar.setTextPanel(pnl);
       form = new formpanel();
       
        
        btn.addActionListener(new ActionListener()
        {
             public void actionPerformed(ActionEvent e){
                 
                 pnl.apendText("Hello\n");
               
           }
        }
        
          
        );
        
        tbar.setStringListener(new StringListener() {
           
           public void textEmitted(String text) {
            pnl.apendText(text);
           }
       });
        
       
                
                
                
                
                
                
                
        
//        form.setFormListener(new FormListener(){
//           public void formEventOccurred(FormEvent e){
//               String name = e.getName();
//               String occupation = e.getOccupation();
//               
//               pnl.apendText(name +":"+ occupation + "\n");
//           }
//        
//        } );
        
         add(form,BorderLayout.WEST);
        add(tbar,BorderLayout.CENTER);
        add(pnl,BorderLayout.EAST);
       
        
        
        setLayout(new FlowLayout());        
        setVisible(true);        
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
