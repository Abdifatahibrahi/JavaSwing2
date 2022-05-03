
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {
    private JButton hellobtn;
    private JButton bybtn;
//    private panel pnl;
    private StringListener textlistener;


    public Toolbar(){
        
        setBorder(BorderFactory.createEtchedBorder());
        
        hellobtn = new JButton("Hello");
        bybtn = new JButton("Good bye");
        
        hellobtn.addActionListener(this);
        bybtn.addActionListener(this);

        
        setLayout(new FlowLayout());
        add(hellobtn);
        add(bybtn);
//              tbar.setTextPanel(pnl);

    }
    
//    public void setTextPanel(panel pnl){
//        
//        this.pnl = pnl;
//        
//    }
    
    public void setStringListener(StringListener listener){
        this.textlistener = listener;
        
    }


    public void actionPerformed(ActionEvent e) {
     JButton clicked = (JButton) e.getSource();
     if(clicked == hellobtn){
//        pnl.apendText("hello\n");
        if(textlistener != null){
            textlistener.textEmitted("hello\n");
        }
     }
     if    (clicked == bybtn){
//           pnl.apendText("Good bye\n");
            if(textlistener != null){
            textlistener.textEmitted("Goodbye\n");
        }
     }
    }
}

   
    
    
    

