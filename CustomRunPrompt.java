
import javax.swing.*;
import java.lang.Runtime;
import java.awt.event.*;

/**
 *
 * @author Chandan
 */


public class CustomRunPrompt extends JFrame{
   
    private final JButton btn_run;
    private JTextField tf_input; 
    private JLabel label_open,label_desc;
    
    CustomRunPrompt(){
	super("Run Prompt");
        label_open=new JLabel("Open:");
        label_desc=new JLabel("Type the name of a program,folder and document");
        label_open.setBounds(10,50,35,25);
        label_desc.setBounds(10,20,280,25);
        tf_input=new JTextField();
        tf_input.setToolTipText(" e.g notepad,calc" );
        tf_input.setEditable(true);
        tf_input.setBounds(50,50,280,25);       
        btn_run=new JButton("run");
        btn_run.setBounds(50,80,80,25);
        
         btn_run.addActionListener(new ActionListener(){  
                @Override
                public void actionPerformed(ActionEvent e){ 
                    Runtime r=Runtime.getRuntime();
                    try{
                        if(! tf_input.getText().isEmpty()){
                            r.exec(tf_input.getText());
                        }                       
                    }catch(Exception ex){ex.printStackTrace();}
		    	
                }  
        });
         
      
        
        setSize(400,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(label_open);
        add(label_desc);
        add(tf_input);
        add(btn_run);
        setLayout(null);
        setResizable(false);
        setVisible(true);
       
        
        
    }
	
	public static void main(String args[]){
	       	new CustomRunPrompt();	
        }
       
}
