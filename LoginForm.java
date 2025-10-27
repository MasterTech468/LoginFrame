
package za.ac.tut.LoginFormFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm extends JFrame{
     private JPanel HeadingPnl;
     private JLabel HeadingLbl;
     
     private JPanel UsernamePnl;
     private JLabel UsernameLbl;
     private JTextField UsernameTxtFld;
     
     private JPanel PasswordPnl;
     private JLabel PasswordLbl;
     
     private JPanel UserNameAndPasswordPnl;
     private JPasswordField PasswordTxtFld;
     
     private JPanel ButtonPnl;
     private JButton SubmitBttn;
     
     private JPanel mainPnl;
    public LoginForm() {
        setTitle("User login page");
        setSize(500,550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        HeadingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        HeadingLbl = new JLabel("Login Details");
        HeadingLbl.setForeground(Color.ORANGE);
        HeadingLbl.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,25));
        HeadingPnl.add(HeadingLbl);
        
        UsernamePnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        UsernameLbl = new JLabel("Username: ");
        UsernameTxtFld = new JTextField(20);
        UsernamePnl.add(UsernameLbl);
        UsernamePnl.add(UsernameTxtFld);
        
        PasswordPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        PasswordLbl = new JLabel("Password: ");
        PasswordTxtFld = new JPasswordField(20);
        PasswordPnl.add(PasswordLbl);
        PasswordPnl.add(PasswordTxtFld);
        
        UserNameAndPasswordPnl = new JPanel(new GridLayout(2,1,1,1));
        
        UserNameAndPasswordPnl.add(UsernamePnl);
        UserNameAndPasswordPnl.add(PasswordPnl);
                
        ButtonPnl = new JPanel();
        SubmitBttn = new JButton("Submit ");
        SubmitBttn.setFocusable(false);
        ButtonPnl.add(SubmitBttn);
        
        
        mainPnl = new JPanel(new BorderLayout());
        mainPnl.add(HeadingPnl,BorderLayout.NORTH);
        mainPnl.add(UserNameAndPasswordPnl,BorderLayout.CENTER);
        mainPnl.add(ButtonPnl,BorderLayout.SOUTH);
        
        add(mainPnl);
        pack();
        setResizable(false);
        setVisible(true);
        
    }
    
}
