
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;


public class formpanel extends JPanel {
            private JLabel namelabel;
            private JLabel occupationlabel;
            private JTextField nameField;
            private JTextField OccupationField;
            private JButton btn;
            private FormListener formlistener;
    
    public formpanel(){
        
        namelabel = new JLabel("Name:");
        occupationlabel = new JLabel("Occupation:");
        nameField = new JTextField(10);
        OccupationField = new JTextField(10);
        btn = new JButton("OK");
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String occupation = OccupationField.getText();
                
                FormEvent ev = new FormEvent(this,name,occupation);

                
                
                if(formlistener != null){
                    formlistener.formEventOccurred(ev);
                }
            }
        });
        Dimension dim = getPreferredSize();
        System.out.println();
//        dim.width = 250;
//        setPreferredSize(dim);
//        System.out.println(dim);
       TitledBorder InnerBorder = BorderFactory.createTitledBorder("Add Person");
       EmptyBorder outerBorder = (EmptyBorder) BorderFactory.createEmptyBorder(5,5,5,5);
       setBorder(BorderFactory.createCompoundBorder(outerBorder,InnerBorder));
       
       setLayout(new GridBagLayout());
       
       GridBagConstraints bg = new GridBagConstraints();
       
       bg.weightx = 1;
       bg.weighty = 0.1;
       
       bg.anchor = GridBagConstraints.LINE_START;
       bg.gridx = 0;
       bg.gridy = 0;
       bg.fill = GridBagConstraints.NONE;
       bg.insets = new Insets(0, 0, 0, 30);
       add(namelabel,bg);
       
       bg.weightx = 1;
       bg.weighty = 0.1;
       
       bg.gridx = 1;
       bg.gridy = 0;
       add(nameField,bg);
       
       bg.weightx = 1;
       bg.weighty = 0.1;
       
       bg.gridx = 0;
       bg.gridy = 1;
       bg.insets = new Insets(0, 0, 0, 50); 
       add(occupationlabel,bg);
       
       bg.weightx = 1;
       bg.weighty = 0.1;
       
       bg.gridx = 1;
       bg.gridy = 1;
       add(OccupationField,bg);
        
       
       bg.anchor = GridBagConstraints.FIRST_LINE_START;
       bg.gridx = 1;
       bg.gridy = 2;
       add(btn ,bg);
       
        
    }
public void setFormListener(FormListener listener){
    this.formlistener = listener;
}
   
}


