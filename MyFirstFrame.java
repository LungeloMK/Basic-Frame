
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.JFrame.setDefaultLookAndFeelDecorated;


    



import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.GroupLayout;
import javax.swing.JFrame;


public class MyFirstFrame extends JFrame {
    
    private javax.swing.JPanel btnsPnl;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton greetBtn;
    private javax.swing.JPanel greetingsAreaPnl;
    private javax.swing.JTextArea greetingsTxtArea;
    private javax.swing.JPanel headingsPnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPnl;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JPanel nameSurnamePnl;
    private javax.swing.JTextField nameTxtFld;
    private javax.swing.JLabel surnameLbl;
    private javax.swing.JTextField surnameTxtFld;

    public MyFirstFrame(){

        setTitle("Greetings UI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.red);
        setDefaultLookAndFeelDecorated(true);
        setSize(200, 250);
        setResizable(true);
        setLayout(new BorderLayout());
      
    
        
        mainPnl = new javax.swing.JPanel( );
        headingsPnl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameSurnamePnl = new javax.swing.JPanel();
        surnameTxtFld = new javax.swing.JTextField(15);
        nameTxtFld = new javax.swing.JTextField(15);
        nameLbl = new javax.swing.JLabel();
        surnameLbl = new javax.swing.JLabel();
        greetingsAreaPnl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        greetingsTxtArea = new javax.swing.JTextArea();
        btnsPnl = new javax.swing.JPanel(new FlowLayout(FlowLayout.CENTER));
        clearBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        greetBtn = new javax.swing.JButton();
        
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); 
        jLabel1.setText("   Greetings App");
        
         nameLbl.setFont(new java.awt.Font("Segoe UI", 1, 15));
        nameLbl.setText("Name");

        surnameLbl.setFont(new java.awt.Font("Segoe UI", 1, 15)); 
        surnameLbl.setText("Surname");
        
        greetingsTxtArea.setColumns(20);
        greetingsTxtArea.setRows(5);
        greetingsTxtArea.setText("Hello [name] [surname]");
        greetingsTxtArea.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Greetings Text", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 15))); // NOI18N
        jScrollPane1.setViewportView(greetingsTxtArea);
        
        clearBtn.setFont(new java.awt.Font("Segoe UI", 1, 15)); 
        clearBtn.setText("Clear");

        exitBtn.setFont(new java.awt.Font("Segoe UI", 1, 15)); 
        exitBtn.setText("Exit");

        greetBtn.setFont(new java.awt.Font("Segoe UI", 1, 15));
        greetBtn.setText("Greet");
        
        // add title to its own panel
        headingsPnl.add(jLabel1);
        
         // add name and surname with thir label and text field to their own panel
        nameSurnamePnl.add(nameLbl);
        nameSurnamePnl.add(nameTxtFld);
        nameSurnamePnl.add(surnameLbl);
        nameSurnamePnl.add(surnameTxtFld);
        
        // add the greetings area to its own panel
        greetingsAreaPnl.add(greetingsTxtArea);
        
        // add 3 buttons to their own panel
        btnsPnl.add(greetBtn);
        btnsPnl.add(clearBtn);
        btnsPnl.add(exitBtn);
        
        // Add all panels to the main panel
        mainPnl.add(nameSurnamePnl,BorderLayout.NORTH);
        mainPnl.add(greetingsAreaPnl,BorderLayout.CENTER);
        mainPnl.add(btnsPnl,BorderLayout.SOUTH);
        
        // Add main panel to the Frame's panel
        add(headingsPnl,BorderLayout.NORTH);
        add(mainPnl,BorderLayout.CENTER);
        
        
        
        
        
        setVisible(true);
          
      
    }
    
    
    
}