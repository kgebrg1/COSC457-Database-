import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CheckIn extends JFrame{
	private JPanel contentPane;
    private JTextField textField;
    private JLabel lblEnterNewAddress;
    private JLabel lblEnterNewName;
    private JLabel lblEnterNewDOB;
    private JLabel lblEnterNewPhone;
    private JLabel lblEnterNewSex;
	
	public static void main(String args[]) {
		 EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {

	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
		 });
	}
	
	public CheckIn() {
    setBounds(450, 360, 1024, 234);
    setResizable(false);

    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    textField = new JTextField();
    textField.setFont(new Font("Tahoma", Font.PLAIN, 34));
    textField.setBounds(373, 35, 609, 67);
    contentPane.add(textField);
    textField.setColumns(10);

    JButton btnSearch = new JButton("Enter");
    btnSearch.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {

            String pstr = textField.getText();
            try {
                System.out.println("update password name ");
                System.out.println("update password");
                
                //add connection
              //  Connection con = (Connection) DriverManager.getConnection();

                PreparedStatement st = (PreparedStatement) con
                    .prepareStatement("Update student set password=? where name=?");

                st.setString(1, pstr);
              //  st.setString(2,);
                st.executeUpdate();
                JOptionPane.showMessageDialog(btnSearch, "Password has been successfully changed");

            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }

        }
    });
    btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 29));
    btnSearch.setBackground(new Color(240, 240, 240));
    btnSearch.setBounds(438, 127, 170, 59);
    contentPane.add(btnSearch);

    lblEnterNewName = new JLabel("Enter Name:");
    contentPane.add(lblEnterNewName);
    lblEnterNewDOB = new JLabel("Enter DOB:");
    contentPane.add(lblEnterNewDOB);
    lblEnterNewPhone = new JLabel("Enter Phone #:");
    contentPane.add(lblEnterNewPhone);
    lblEnterNewAddress = new JLabel("Enter Address:");
    contentPane.add(lblEnterNewAddress);
    lblEnterNewSex = new JLabel("Enter sex:");
    contentPane.add(lblEnterNewSex);
    }
}